# elasticsearch_plugin_example

http://qiita.com/ike_s/items/0f3443841e2f2c4dcfc5

パッケージ作成

    $ mvn package

pluginインストール

    $ cd elasticsearch
    $ ./bin/plugin --url file:///[exaple-plugin-path]/target/releases/example-plugin-1.0-SNAPSHOT.zip install example-plugin
