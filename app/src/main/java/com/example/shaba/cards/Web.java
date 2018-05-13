package com.example.shaba.cards;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

public class Web extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        WebView webView = new WebView(this);
        setContentView(webView);
        String summary = "<html><head>\n" +
                "\t<meta charset=\"UTF-8\">\n" +
                "</head><body><div class=\"article__middle\">\n" +
                "                    <div class=\"article__zoom-overlay\"></div><h1 class=\"article__title\" itemprop=\"headline\">Электричество на пальцах.Электрический заряд. </h1>\n" +
                "    <div itemprop=\"articleBody\">\n" +
                "        <h2 class=\"article-block\">\n" +
                "</h2>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 1000px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac0faed5991d33f1beb4007_5ac101d82394df3eb1ba9c93\"><img itemprop=\"image\" class=\"article-block-image__image \" src=\"https://avatars.mds.yandex.net/get-zen_doc/51182/pub_5ac0faed5991d33f1beb4007_5ac101d82394df3eb1ba9c93/scale_600\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/51182/pub_5ac0faed5991d33f1beb4007_5ac101d82394df3eb1ba9c93/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/51182/pub_5ac0faed5991d33f1beb4007_5ac101d82394df3eb1ba9c93/scale_1200 2x\" alt=\"\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<h2 class=\"article-block\">Электрический заряд\n" +
                "</h2>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Электрические свойства</strong> у тел проявляются в том, что после их взаимодействия с другими объектами, эти тела начинают притягивать к себе легкие предметы.\n" +
                "</blockquote>\n" +
                "<p class=\"article-block article-block-unstyled\">Тела которые обладают электрическими свойствами <strong>называют наэлектризованными телами или телами, обладающими электрическим зарядом.</strong>\n" +
                "</p><div class=\"article-block article-block-embed\"></div>\n" +
                "<p class=\"article-block article-block-unstyled\">Наэлектризованные тела или притягиваются к друг другу, или отталкиваются.\n" +
                "</p>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 640px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac0faed5991d33f1beb4007_5ac0fc693dceb733d3dc7169\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/249065/pub_5ac0faed5991d33f1beb4007_5ac0fc693dceb733d3dc7169/scale_600\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/249065/pub_5ac0faed5991d33f1beb4007_5ac0fc693dceb733d3dc7169/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/249065/pub_5ac0faed5991d33f1beb4007_5ac0fc693dceb733d3dc7169/scale_1200 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/249065/pub_5ac0faed5991d33f1beb4007_5ac0fc693dceb733d3dc7169/scale_600\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/249065/pub_5ac0faed5991d33f1beb4007_5ac0fc693dceb733d3dc7169/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/249065/pub_5ac0faed5991d33f1beb4007_5ac0fc693dceb733d3dc7169/scale_1200 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\"><strong>Тела, имеющие одинаковые заряды отталкиваются, а тела имеющие разные заряды, притягиваются.</strong> \n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 400px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac0faed5991d33f1beb4007_5ac0fcb348267788694d55f8\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/198359/pub_5ac0faed5991d33f1beb4007_5ac0fcb348267788694d55f8/scale_600\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/198359/pub_5ac0faed5991d33f1beb4007_5ac0fcb348267788694d55f8/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/198359/pub_5ac0faed5991d33f1beb4007_5ac0fcb348267788694d55f8/scale_1200 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/198359/pub_5ac0faed5991d33f1beb4007_5ac0fcb348267788694d55f8/scale_600\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/198359/pub_5ac0faed5991d33f1beb4007_5ac0fcb348267788694d55f8/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/198359/pub_5ac0faed5991d33f1beb4007_5ac0fcb348267788694d55f8/scale_1200 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 335px;\"><div class=\"article-block-image__placeholder\" style=\"background-color: #F8F8F8; padding-bottom: 35%\"></div><div class=\"article-block-image__zoom\" id=\"pub_5ac0faed5991d33f1beb4007_5ac0fcbc9d5cb350233b820f\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/50335/pub_5ac0faed5991d33f1beb4007_5ac0fcbc9d5cb350233b820f/scale_600\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/50335/pub_5ac0faed5991d33f1beb4007_5ac0fcbc9d5cb350233b820f/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/50335/pub_5ac0faed5991d33f1beb4007_5ac0fcbc9d5cb350233b820f/scale_1200 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/50335/pub_5ac0faed5991d33f1beb4007_5ac0fcbc9d5cb350233b820f/scale_600\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/50335/pub_5ac0faed5991d33f1beb4007_5ac0fcbc9d5cb350233b820f/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/50335/pub_5ac0faed5991d33f1beb4007_5ac0fcbc9d5cb350233b820f/scale_1200 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Электрический заряд </strong>- это свойство элементарных частиц, стабильными среди которых являются протоны и электроны, а также число протонов и электронов разное.\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Протон</strong> - элементарная частица с положительным зарядом.\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Электрон</strong> - элементарная частица с отрицательным зарядом.\n" +
                "</blockquote>\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 960px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac0faed5991d33f1beb4007_5ac0fe5a57906a1b175ec626\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/62917/pub_5ac0faed5991d33f1beb4007_5ac0fe5a57906a1b175ec626/scale_600\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/62917/pub_5ac0faed5991d33f1beb4007_5ac0fe5a57906a1b175ec626/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/62917/pub_5ac0faed5991d33f1beb4007_5ac0fe5a57906a1b175ec626/scale_1200 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/62917/pub_5ac0faed5991d33f1beb4007_5ac0fe5a57906a1b175ec626/scale_600\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/62917/pub_5ac0faed5991d33f1beb4007_5ac0fe5a57906a1b175ec626/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/62917/pub_5ac0faed5991d33f1beb4007_5ac0fe5a57906a1b175ec626/scale_1200 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\"><strong>Ядро состоит из элементарных частиц: положительно заряженных протонов и нейтронов, у которых заряда нет.</strong>\n" +
                "</p>\n" +
                "<h2 class=\"article-block\"><strong>ИОНЫ</strong>\n" +
                "</h2>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 440px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac0faed5991d33f1beb4007_5ac0fee857906a1b175ec62d\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/195198/pub_5ac0faed5991d33f1beb4007_5ac0fee857906a1b175ec62d/scale_600\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/195198/pub_5ac0faed5991d33f1beb4007_5ac0fee857906a1b175ec62d/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/195198/pub_5ac0faed5991d33f1beb4007_5ac0fee857906a1b175ec62d/scale_1200 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/195198/pub_5ac0faed5991d33f1beb4007_5ac0fee857906a1b175ec62d/scale_600\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/195198/pub_5ac0faed5991d33f1beb4007_5ac0fee857906a1b175ec62d/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/195198/pub_5ac0faed5991d33f1beb4007_5ac0fee857906a1b175ec62d/scale_1200 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Положительный ион - </strong>это атом, потерявший один или несколько электронов.\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Отрицательный ион -</strong> это атом, захвативший один или несколько электронов.\n" +
                "</blockquote>\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<h3 class=\"article-block\">Механизм образования заряда при взаимодействии незаряженных тел.\n" +
                "</h3>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 984px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac0faed5991d33f1beb4007_5ac0ff8cf031731b9711c014\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/57035/pub_5ac0faed5991d33f1beb4007_5ac0ff8cf031731b9711c014/scale_600\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/57035/pub_5ac0faed5991d33f1beb4007_5ac0ff8cf031731b9711c014/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/57035/pub_5ac0faed5991d33f1beb4007_5ac0ff8cf031731b9711c014/scale_1200 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/57035/pub_5ac0faed5991d33f1beb4007_5ac0ff8cf031731b9711c014/scale_600\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/57035/pub_5ac0faed5991d33f1beb4007_5ac0ff8cf031731b9711c014/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/57035/pub_5ac0faed5991d33f1beb4007_5ac0ff8cf031731b9711c014/scale_1200 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<blockquote class=\"article-block article-block-quote\">Процесс образования электрического заряда у тел называется <strong>электризацией.</strong>\n" +
                "</blockquote>\n" +
                "<p class=\"article-block article-block-unstyled\"><strong>В процессе электризации электроны с одного тела переходят на другое тело. Тело, с которого электроны ушли приобретает положительный заряд, а тело, на которое электроны перешли - отрицательный заряд.</strong>\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<h2 class=\"article-block\">Механизм электризации при взаимодействии заряженного и незаряженного тела.\n" +
                "</h2>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 972px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac0faed5991d33f1beb4007_5ac1005bdcaf8ec068a92e5b\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/225901/pub_5ac0faed5991d33f1beb4007_5ac1005bdcaf8ec068a92e5b/scale_600\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/225901/pub_5ac0faed5991d33f1beb4007_5ac1005bdcaf8ec068a92e5b/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/225901/pub_5ac0faed5991d33f1beb4007_5ac1005bdcaf8ec068a92e5b/scale_1200 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/225901/pub_5ac0faed5991d33f1beb4007_5ac1005bdcaf8ec068a92e5b/scale_600\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/225901/pub_5ac0faed5991d33f1beb4007_5ac1005bdcaf8ec068a92e5b/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/225901/pub_5ac0faed5991d33f1beb4007_5ac1005bdcaf8ec068a92e5b/scale_1200 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Проводники</strong> - вещества, через которые электрический заряд может передаваться от заряженного тела к незаряженному.\n" +
                "</blockquote>\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Непроводники или диэлектрики</strong> - это вещества, через которые электрический заряд не может переходить от заряженного тела к незаряженному.\n" +
                "</blockquote>\n" +
                "\n" +
                "\n" +
                "    </div>\n" +
                "\n" +
                "\n" +
                "                </div></body></html>";
        webView.loadData(summary,"text/html; charset=utf-8", "utf-8");
    }

}
