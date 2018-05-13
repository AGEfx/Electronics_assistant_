package com.example.shaba.cards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Equip4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equip4);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
String s ="<html lang=\"ru\" prefix=\"og: http://ogp.me/ns#\"><head><meta charset=\"UTF-8\">\n" +
        "            <link rel=\"canonical\" href=\"https://zen.yandex.ru/media/elektronik/chto-takoe-arduino-elektronika-dlia-chainikov--5ad4f3e348267794c1c64cb7\">\n" +
        "        <title>ЧТО ТАКОЕ ARDUINO? ЭЛЕКТРОНИКА ДЛЯ ЧАЙНИКОВ. | ЗАМЕТКИ ЭЛЕКТРОТЕХНИКА | Яндекс Дзен</title><meta property=\"og:title\" content=\"ЧТО ТАКОЕ ARDUINO? ЭЛЕКТРОНИКА ДЛЯ ЧАЙНИКОВ. \">\n" +
        "<meta property=\"og:description\" content=\"Arduino-oткрытая плaтфopмa, основанная на простом в использовании оборудовании и программном обеспечении. Модули Arduino могут прочитать входные сигналы-свет на датчике, нажатие на кнопке. Вы можете сказать вашей Ардуино, что сделать путем отправки комплекта инструкций к микроконтроллеру, расположенному на каждом модуле. Для этого используется язык разработки Arduino (основанный на проводке) и про\">\n" +
        "<meta property=\"og:image\" content=\"https://avatars.mds.yandex.net/get-zen_doc/1209363/pub_5ad4fc1d87696a00b76e59d4_5ad4fc1d87696a00b76e59d5/orig\">\n" +
        "<meta property=\"og:url\" content=\"https://zen.yandex.ru/media/elektronik/chto-takoe-arduino-elektronika-dlia-chainikov--5ad4f3e348267794c1c64cb7\">\n" +
        "<meta name=\"twitter:card\" content=\"summary_large_image\">\n" +
        "<meta property=\"og:site_name\" content=\"Яндекс Дзен | Платформа для авторов, издателей и брендов\">\n" +
        "<meta name=\"twitter:image:alt\" content=\"ЧТО ТАКОЕ ARDUINO? ЭЛЕКТРОНИКА ДЛЯ ЧАЙНИКОВ. \">\n" +
        "<meta name=\"description\" content=\"Arduino-oткрытая плaтфopмa, основанная на простом в использовании оборудовании и программном обеспечении. Модули Arduino могут прочитать входные сигналы-свет на датчике, нажатие на кнопке. Вы можете сказать вашей Ардуино, что сделать путем отправки комплекта инструкций к микроконтроллеру, расположенному на каждом модуле. Для этого используется язык разработки Arduino (основанный на проводке) и про\">\n" +
        "                <meta name=\"viewport\" content=\"width=device-width,minimum-scale=1,maximum-scale=1,initial-scale=1,user-scalable=no, minimal-ui\"><link rel=\"prefetch\" href=\"https://an.yandex.ru/system/context.js\"><meta property=\"mobile-web-app-capable\" content=\"yes\"><link rel=\"apple-touch-icon\" href=\"//yastatic.net/zen-logos/files/favicons/apple-touch-icon-57x57.png\" sizes=\"57x57\">\n" +
        "<link rel=\"apple-touch-icon\" href=\"//yastatic.net/zen-logos/files/favicons/apple-touch-icon-60x60.png\" sizes=\"60x60\">\n" +
        "<link rel=\"apple-touch-icon\" href=\"//yastatic.net/zen-logos/files/favicons/apple-touch-icon-72x72.png\" sizes=\"72x72\">\n" +
        "<link rel=\"apple-touch-icon\" href=\"//yastatic.net/zen-logos/files/favicons/apple-touch-icon-76x76.png\" sizes=\"76x76\">\n" +
        "<link rel=\"apple-touch-icon\" href=\"//yastatic.net/zen-logos/files/favicons/apple-touch-icon-114x114.png\" sizes=\"114x114\">\n" +
        "<link rel=\"apple-touch-icon\" href=\"//yastatic.net/zen-logos/files/favicons/apple-touch-icon-120x120.png\" sizes=\"120x120\">\n" +
        "<link rel=\"apple-touch-icon\" href=\"//yastatic.net/zen-logos/files/favicons/apple-touch-icon-144x144.png\" sizes=\"144x144\">\n" +
        "<link rel=\"apple-touch-icon\" href=\"//yastatic.net/zen-logos/files/favicons/apple-touch-icon-152x152.png\" sizes=\"152x152\">\n" +
        "\n" +
        "<link rel=\"shortcut icon\" href=\"//yastatic.net/zen-logos/files/favicons/favicon-16x16.png\" sizes=\"16x16\">\n" +
        "<link rel=\"shortcut icon\" href=\"//yastatic.net/zen-logos/files/favicons/favicon-32x32.png\" sizes=\"32x32\">\n" +
        "<link rel=\"shortcut icon\" href=\"//yastatic.net/zen-logos/files/favicons/favicon-96x96.png\" sizes=\"96x96\">\n" +
        "<link rel=\"shortcut icon\" href=\"//yastatic.net/zen-logos/files/favicons/favicon-160x160.png\" sizes=\"160x160\">\n" +
        "<link rel=\"shortcut icon\" href=\"//yastatic.net/zen-logos/files/favicons/favicon-196x196.png\" sizes=\"196x196\">\n" +
        "<link rel=\"icon\" href=\"//yastatic.net/zen-logos/files/favicons/icon.svg\" type=\"image/svg+xml\" sizes=\"any\">\n" +
        "<script type=\"text/javascript\" async=\"\" src=\"https://mc.yandex.ru/metrika/watch.js\"></script><script type=\"text/javascript\" async=\"\" src=\"https://mc.yandex.ru/metrika/watch.js\"></script>\n" +
        "\n" +
        "</head><body><p class=\"article-block article-block-unstyled\"> \n" +
        "</p>\n" +
        "<p class=\"article-block article-block-unstyled\">Arduino-oткрытая плaтфopмa, основанная на простом в использовании оборудовании и программном обеспечении. Модули Arduino могут прочитать входные сигналы-свет на датчике, нажатие на кнопке. Вы можете сказать вашей Ардуино, что сделать путем отправки комплекта инструкций к микроконтроллеру, расположенному на каждом модуле. Для этого используется язык разработки Arduino (основанный на проводке) и программное обеспечение Arduino (IDE), основанное на обработке.<br>\n" +
        "</p>\n" +
        "<p class=\"article-block article-block-unstyled\">\n" +
        "</p>\n" +
        "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 1088px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ad4f3e348267794c1c64cb7_5ad4fbb59d5cb3809901f894\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/1209300/pub_5ad4f3e348267794c1c64cb7_5ad4fbb59d5cb3809901f894/scale_360\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/1209300/pub_5ad4f3e348267794c1c64cb7_5ad4fbb59d5cb3809901f894/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/1209300/pub_5ad4f3e348267794c1c64cb7_5ad4fbb59d5cb3809901f894/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/1209300/pub_5ad4f3e348267794c1c64cb7_5ad4fbb59d5cb3809901f894/scale_720 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/1209300/pub_5ad4f3e348267794c1c64cb7_5ad4fbb59d5cb3809901f894/scale_360\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/1209300/pub_5ad4f3e348267794c1c64cb7_5ad4fbb59d5cb3809901f894/scale_360 1x, https://avatars.mds.yandex.net/get-zen_doc/1209300/pub_5ad4f3e348267794c1c64cb7_5ad4fbb59d5cb3809901f894/scale_540 1.5x, https://avatars.mds.yandex.net/get-zen_doc/1209300/pub_5ad4f3e348267794c1c64cb7_5ad4fbb59d5cb3809901f894/scale_720 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
        "\n" +
        "<p class=\"article-block article-block-unstyled\">\n" +
        "</p>\n" +
        "<p class=\"article-block article-block-unstyled\">Вот уже большое количество лет Arduino является главной частью большинства проектов, от каждодневных задач до сложных научных приложении. Мировое сообщество создателей собралось вокруг этой платформы, их вклад стал результатом невероятного количества знаний, которые могут быть большим подспорьем для начинающих и опытных людей.<br>\n" +
        "</p>\n" +
        "<p class=\"article-block article-block-unstyled\">Arduino был придуман как обычный инструмент для разработки, предназначенный для студентов в электронике и программировании. Как только он достиг большого круга почитателей, модули Arduinoстали совершенствоваться, чтобы адаптироваться к новым потребностям и проблемам, начиная  от самых простых 8-битных плат до очень сложных приборов и изобретений. Все модули Arduino, предоставляют пользователям возможность создавать их самостоятельно для своих нужд. Программное обеспечение также является открытым исходным кодом, и он растет за счет вклада пользователей во всем мире.<br>\n" +
        "</p>\n" +
        "<p class=\"article-block article-block-unstyled\">\n" +
        "</p>\n" +
        "<p class=\"article-block article-block-unstyled\">Почему именно Ардуино? У него простой и доступный интерфейс,&nbsp; Arduino используется в большом количестве разных проектов и приложениях. Программное обеспечение Arduino является простым в использовании для начинающих, но достаточно гибким для продвинутых пользователей. Он работает на Aple, Windows и Linux. Преподаватели и студенты используют его для создания недорогих научных инструментов, для доказательства принципов химии и физики или для начала работы с программированием и робототехникой.&nbsp; Arduino - лучший инструмент для получения знаний в электронике. Каждый, начиная от ребенка и заканчивая опытным разработчиком могут начать мастерить просто следуя шаг за шагом инструкции комплекта, или обмена идеями в интернете с другими членами сообщества Arduino. \n" +
        "</p>\n" +
        "        \n" +
        "        \n" +
        "\n" +
        "<div style=\"position: fixed; left: -99px;\"><div id=\"sf-3223178495\" style=\"width: 1px; height: 1px; position: relative;\"><iframe frameborder=\"no\" scrolling=\"no\" allowtransparency=\"true\" hidefocus=\"true\" tabindex=\"-1\" marginwidth=\"0\" marginheight=\"0\" name=\"%7B%22id%22%3A%22sf-3223178495%22%2C%22html%22%3A%22%3Cscript%3Evar%20config%3D%7B%5C%22rtb%5C%22%3A%7B%5C%22matchUrls%5C%22%3A%5B%5C%22https%3A%2F%2Fan.yandex.ru%2Fmapuid%2Fbidswitch%2F%5C%22%2C%5C%22https%3A%2F%2Fan.yandex.ru%2Fmapuid%2Frubicon%2F%5C%22%2C%5C%22https%3A%2F%2Fan.yandex.ru%2Fmapuid%2Fgoogle%2F%5C%22%2C%5C%22https%3A%2F%2Fdmg.digitaltarget.ru%2F1%2F119%2Fi%2Fi%3Fi%3D1525979820%5C%22%2C%5C%22https%3A%2F%2Fyandex-dmp-sync.rutarget.ru%2Fsync%5C%22%2C%5C%22https%3A%2F%2Fyandex-sync.rutarget.ru%2Fsync%5C%22%2C%5C%22https%3A%2F%2Fx01.aidata.io%2F0.gif%3Fpid%3DYANDEX%5C%22%2C%5C%22https%3A%2F%2Fsync.1dmp.io%2Fpixel.gif%3Fcid%3D3cbc2ec8-1421-4677-89fe-2ac6fc52a09a%26pid%3Dw%26o%3Dau%5C%22%2C%5C%22https%3A%2F%2Fredirect.frontend.weborama.fr%2Fredirect%2Fstandard%3Furl%3Dhttps%3A%2F%2Fan.yandex.ru%2Fmapuid%2Fdmpweborama%2F%7BWEBO_CID%7D%5C%22%2C%5C%22https%3A%2F%2Ffront.facetz.net%2Fcollect%3Fsync_redirect%3Dyandexdmp%5C%22%5D%7D%7D%3C%2Fscript%3E%3Cscript%3E%5C%22use%20strict%5C%22%3Bfunction%20t(t%2Ce%2Cn)%7Bvar%20s%3Dt%2B%5C%22%3D1%5C%22%3Bif(-1%3D%3D%3Ddocument.cookie.indexOf(s))%7Bvar%20a%3D86400*e*1e3%2Cc%3Dnew%20Date%2Cr%3Dnew%20Date(Number(c)%2Ba).toUTCString()%3Bdocument.cookie%3Ds%2B%5C%22%3B%20expires%3D%5C%22%2Br%2Cn()%7D%7Dfunction%20e(t)%7B(new%20Image).src%3Dt%7Dif(config.rtb)%7Bvar%20n%3Dconfig.rtb.matchUrls%3Bt(%5C%22pcs3%5C%22%2C1%2Cfunction()%7Bvar%20t%2Ce%3Bt%3D%5C%22https%3A%2F%2Fyastatic.net%2Fq%2Fset%2Fs%2Frsya-tag-users%2Fbundle.js%5C%22%2C(e%3Ddocument.createElement(%5C%22script%5C%22)).src%3Dt%2Cdocument.body.appendChild(e)%7D)%2Cs%3D.2%2CMath.random()%3Cs%26%26t(%5C%22pcssspb%5C%22%2C14%2Cfunction()%7Bfor(var%20t%3D0%3Bt%3Cn.length%3Bt%2B%2B)e(n%5Bt%5D)%7D)%2Ce(%5C%22https%3A%2F%2Fysa-static.passport.yandex.ru%2Fstatic%2F1%2Fd959d7e39d5067fad30d9c06204866e9%2Fd.png%3Fex%3Dyes%5C%22)%7Dvar%20s%3B%3C%2Fscript%3E%22%2C%22pmGuid%22%3A%22_1525979820637_70_3%22%2C%22geom%22%3A%7B%22win%22%3A%7B%22t%22%3A0%2C%22l%22%3A0%2C%22w%22%3A685%2C%22h%22%3A831%2C%22b%22%3A831%2C%22r%22%3A685%7D%2C%22self%22%3A%7B%22t%22%3A2560%2C%22l%22%3A-99%2C%22b%22%3A2561%2C%22r%22%3A-98%2C%22w%22%3A1%2C%22h%22%3A1%2C%22xiv%22%3A0%2C%22yiv%22%3A0%2C%22iv%22%3A0%2C%22z%22%3A0%7D%2C%22exp%22%3A%7B%22t%22%3A2560%2C%22l%22%3A0%2C%22r%22%3A783%2C%22b%22%3A0%2C%22xs%22%3A0%2C%22ys%22%3A0%7D%7D%2C%22hasFocus%22%3Atrue%2C%22supports%22%3A%7B%22exp-ovr%22%3Atrue%2C%22exp-push%22%3Afalse%2C%22read-cookie%22%3Afalse%2C%22write-cookie%22%3Afalse%7D%2C%22css%22%3A%22%22%2C%22bg%22%3A%22transparent%22%2C%22posMeta%22%3A%7B%22sharedData%22%3A%7B%22sf_ver%22%3A%221-1-0%22%2C%22ck_o%22%3A1%2C%22flash_ver%22%3A0%7D%2C%22ownerKey%22%3A%22%22%2C%22privateData%22%3A%7B%7D%7D%2C%22target%22%3A%22_blank%22%2C%22basePath%22%3A%22%22%7D\" src=\"//yastatic.net/safeframe-bundles/0.33/1-1-0/render.html\" width=\"1\" height=\"1\" style=\"width: 1px; height: 1px; top: 0px; left: 0px; position: absolute;\"></iframe></div></div></body></html>";
        WebView webView = new WebView(this);
        setContentView(webView);
        webView.loadData(s,"text/html; charset=utf-8", "utf-8");
    }
}
