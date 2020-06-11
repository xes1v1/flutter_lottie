package com.example.flutter_lottie;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.PluginRegistry.Registrar;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import io.flutter.plugin.common.StandardMessageCodec;

import android.content.Context;

public class LottieViewFactory extends PlatformViewFactory {

    private final FlutterPlugin.FlutterPluginBinding mPluginRegistrar;

    public LottieViewFactory(FlutterPlugin.FlutterPluginBinding registrar) {
        super(StandardMessageCodec.INSTANCE);
        mPluginRegistrar = registrar;
    }

    @Override
    public PlatformView create(Context context, int id, Object args) {
        return new LottieView(context, id, args, mPluginRegistrar);
    }
}
