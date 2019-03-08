import 'dart:convert';
import 'dart:io';

import 'package:flutter/material.dart';
import 'dart:async';

import 'package:flutter/services.dart';
import 'package:storage_path/storage_path.dart';
import 'package:storage_path_example/file_model.dart';

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  String imagePath = "";
  @override
  void initState() {
    super.initState();
    getImagesPath();
  }

  Future<void> getImagesPath() async {
    String imagespath = "";
    try {
      imagespath = await StoragePath.imagesPath;
      var response = jsonDecode(imagespath);
      print(response);
      var imageList = response as List;
      List<FileModel> list =
          imageList.map<FileModel>((json) => FileModel.fromJson(json)).toList();

      setState(() {
        imagePath = list[11].files[0];
      });
    } on PlatformException {
      imagespath = 'Failed to get path';
    }
    return imagespath;
  }

  Future<void> getVideoPath() async {
    String videoPath = "";
    try {
      videoPath = await StoragePath.videoPath;
      var response = jsonDecode(videoPath);
      print(response);
    } on PlatformException {
      videoPath = 'Failed to get path';
    }
    return videoPath;
  }
    Future<void> getAudioPath() async {
    String audioPath = "";
    try {
      audioPath = await StoragePath.audioPath;
      var response = jsonDecode(audioPath);
      print(response);
    } on PlatformException {
      audioPath = 'Failed to get path';
    }
    return audioPath;
  }
 Future<void> getFilePath() async {
    String filePath = "";
    try {
      filePath = await StoragePath.filePath;
      var response = jsonDecode(filePath);
      print(response);
    } on PlatformException {
      filePath = 'Failed to get path';
    }
    return filePath;
  }
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Plugin example app'),
        ),
        body: Center(
          child: Container(
            width: 200,
            height: 200,
            child: imagePath != ""
                ? Image.file(
                    File(imagePath),
                    fit: BoxFit.contain,
                  )
                : Container(),
          ),
        ),
      ),
    );
  }
}
