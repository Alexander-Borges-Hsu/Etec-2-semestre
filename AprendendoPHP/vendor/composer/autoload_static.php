<?php

// autoload_static.php @generated by Composer

namespace Composer\Autoload;

class ComposerStaticInit3e74dd41adbe0b1e1b59bc2519141bf2
{
    public static $prefixLengthsPsr4 = array (
        'A' => 
        array (
            'Admin\\Htdocs\\' => 13,
        ),
    );

    public static $prefixDirsPsr4 = array (
        'Admin\\Htdocs\\' => 
        array (
            0 => __DIR__ . '/../..' . '/src',
        ),
    );

    public static $classMap = array (
        'Composer\\InstalledVersions' => __DIR__ . '/..' . '/composer/InstalledVersions.php',
    );

    public static function getInitializer(ClassLoader $loader)
    {
        return \Closure::bind(function () use ($loader) {
            $loader->prefixLengthsPsr4 = ComposerStaticInit3e74dd41adbe0b1e1b59bc2519141bf2::$prefixLengthsPsr4;
            $loader->prefixDirsPsr4 = ComposerStaticInit3e74dd41adbe0b1e1b59bc2519141bf2::$prefixDirsPsr4;
            $loader->classMap = ComposerStaticInit3e74dd41adbe0b1e1b59bc2519141bf2::$classMap;

        }, null, ClassLoader::class);
    }
}
