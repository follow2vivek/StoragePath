#import "StoragePathPlugin.h"
#import <storage_path/storage_path-Swift.h>

@implementation StoragePathPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftStoragePathPlugin registerWithRegistrar:registrar];
}
@end
