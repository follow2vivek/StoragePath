import 'dart:async';

import 'package:flutter/services.dart';

class StoragePath {
  static const _channel = const MethodChannel('storage_path');

  static Future<String?> get imagesPath =>
      _channel.invokeMethod<String>('getImagesPath');

  static Future<String?> get videoPath =>
      _channel.invokeMethod<String>('getVideosPath');

  static Future<String?> get audioPath =>
      _channel.invokeMethod<String>('getAudioPath');

  static Future<String?> get filePath =>
      _channel.invokeMethod<String>('getFilesPath');
}
