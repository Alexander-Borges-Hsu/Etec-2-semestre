<?php return array(
    'root' => array(
        'name' => 'admin/php-estudos',
        'pretty_version' => 'dev-main',
        'version' => 'dev-main',
        'reference' => '91a5f46d9bd971fe1353e59a917e211d5146da60',
        'type' => 'project',
        'install_path' => __DIR__ . '/../../',
        'aliases' => array(),
        'dev' => true,
    ),
    'versions' => array(
        'admin/php-estudos' => array(
            'pretty_version' => 'dev-main',
            'version' => 'dev-main',
            'reference' => '91a5f46d9bd971fe1353e59a917e211d5146da60',
            'type' => 'project',
            'install_path' => __DIR__ . '/../../',
            'aliases' => array(),
            'dev_requirement' => false,
        ),
        'monolog/monolog' => array(
            'pretty_version' => '3.7.0',
            'version' => '3.7.0.0',
            'reference' => 'f4393b648b78a5408747de94fca38beb5f7e9ef8',
            'type' => 'library',
            'install_path' => __DIR__ . '/../monolog/monolog',
            'aliases' => array(),
            'dev_requirement' => false,
        ),
        'psr/log' => array(
            'pretty_version' => '3.0.2',
            'version' => '3.0.2.0',
            'reference' => 'f16e1d5863e37f8d8c2a01719f5b34baa2b714d3',
            'type' => 'library',
            'install_path' => __DIR__ . '/../psr/log',
            'aliases' => array(),
            'dev_requirement' => false,
        ),
        'psr/log-implementation' => array(
            'dev_requirement' => false,
            'provided' => array(
                0 => '3.0.0',
            ),
        ),
    ),
);