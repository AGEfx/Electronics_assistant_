package com.example.shaba.cards;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

public class Theory_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory_1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        String s = "<html lang=\"ru\" prefix=\"og: http://ogp.me/ns#\" class=\"\"><head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Электричество доступным языком. Как в нем разобраться? | ЗАМЕТКИ ЭЛЕКТРОТЕХНИКА | Яндекс Дзен</title>\n" +
                "        <link rel=\"canonical\" href=\"https://zen.yandex.ru/media/elektronik/elektrichestvo-dostupnym-iazykom-kak-v-nem-razobratsia-5ac0f23c256d5cfc635d320a\">\n" +
                "        <meta name=\"description\" content=\"Многие, увидев, в первый раз какую-нибудь сложную схему, прочитав какие-то непонятные термины и названия очень быстро теряют интерес к этому и просто отступают. Я хочу доказать что, электричество это не так уж и сложно, как может показаться на первый взгляд.\n" +
                "Прежде всего стоит понять, что же такое электричество?\n" +
                "Электричество или электрический ток - это упорядоченное (направленное) движение свобод\">\n" +
                "    <meta property=\"og:title\" content=\"Электричество доступным языком. Как в нем разобраться?\">\n" +
                "<meta property=\"og:description\" content=\"Многие, увидев, в первый раз какую-нибудь сложную схему, прочитав какие-то непонятные термины и названия очень быстро теряют интерес к этому и просто отступают. Я хочу доказать что, электричество это не так уж и сложно, как может показаться на первый взгляд.\n" +
                "Прежде всего стоит понять, что же такое электричество?\n" +
                "Электричество или электрический ток - это упорядоченное (направленное) движение свобод\">\n" +
                "<meta property=\"og:image\" content=\"https://avatars.mds.yandex.net/get-zen_doc/58826/pub_5ac3b268cb7f0e00b762084a_5ac3b268cb7f0e00b762084b/orig\">\n" +
                "<meta property=\"og:url\" content=\"https://zen.yandex.ru/media/elektronik/elektrichestvo-dostupnym-iazykom-kak-v-nem-razobratsia-5ac0f23c256d5cfc635d320a\">\n" +
                "<meta name=\"twitter:card\" content=\"summary_large_image\">\n" +
                "<meta property=\"og:site_name\" content=\"Яндекс Дзен | Платформа для авторов, издателей и брендов\">\n" +
                "<meta name=\"twitter:image:alt\" content=\"Электричество доступным языком. Как в нем разобраться?\">\n" +
                "\n" +
                "    <link rel=\"prefetch\" href=\"https://an.yandex.ru/system/context.js\">\n" +
                "        <link rel=\"preload\" href=\"//yastatic.net/zen-publishers/auto/article.logos.0ecfe427cd4f05eeb414f7cbb7d92ec7.css\" as=\"style\">\n" +
                "        \n" +
                "        <script type=\"text/javascript\" async=\"\" src=\"https://mc.yandex.ru/metrika/tag.js\"></script><script type=\"text/javascript\" async=\"\" src=\"https://mc.yandex.ru/metrika/tag.js\"></script><script type=\"text/javascript\" async=\"\" src=\"https://mc.yandex.ru/metrika/tag.js\"></script><script nonce=\"\">window._bundleName = 'article';</script>\n" +
                "        <script nonce=\"\">window._manifestHashes = {\n" +
                "  \"article-editor-vendor.js\": \"article-editor-vendor.b5150acb71fee2c6f3b9.js\",\n" +
                "  \"article-editor.css\": \"article-editor.37b5d6bbde7760d908e8940db7870a49.css\",\n" +
                "  \"article-editor.js\": \"article-editor.b4b8bd762487df38c97a.js\",\n" +
                "  \"article-editor.logos.css\": \"article-editor.logos.37b5d6bbde7760d908e8940db7870a49.css\",\n" +
                "  \"article-vendor.js\": \"article-vendor.d5cd7aa50556720249a7.js\",\n" +
                "  \"article-video-vendor.js\": \"article-video-vendor.0869ca3826df994969ef.js\",\n" +
                "  \"article-video.css\": \"article-video.504cee52376c4f36c48e8e0438dfb5d5.css\",\n" +
                "  \"article-video.js\": \"article-video.29dc535d92c0324ba468.js\",\n" +
                "  \"article-video.logos.css\": \"article-video.logos.504cee52376c4f36c48e8e0438dfb5d5.css\",\n" +
                "  \"article.css\": \"article.0ecfe427cd4f05eeb414f7cbb7d92ec7.css\",\n" +
                "  \"article.js\": \"article.2e363a14c40d21f7fcf6.js\",\n" +
                "  \"article.logos.css\": \"article.logos.0ecfe427cd4f05eeb414f7cbb7d92ec7.css\",\n" +
                "  \"hls-light.js\": \"fc41a6af4c023a45936a.js\",\n" +
                "  \"karma-vendor.js\": \"karma-vendor.241b94a792e80a1718ff.js\",\n" +
                "  \"karma.css\": \"karma.5a824ffd3cb22e0d1a03bef886e14134.css\",\n" +
                "  \"karma.js\": \"karma.704ee0aab6b991114689.js\",\n" +
                "  \"karma.logos.css\": \"karma.logos.5a824ffd3cb22e0d1a03bef886e14134.css\",\n" +
                "  \"login-vendor.js\": \"login-vendor.a9c8e689b939c6586561.js\",\n" +
                "  \"login.css\": \"login.558410e1f3869677c9f32e6cf59a159c.css\",\n" +
                "  \"login.js\": \"login.bbcf9d73e5ffc56a5b4c.js\",\n" +
                "  \"login.logos.css\": \"login.logos.558410e1f3869677c9f32e6cf59a159c.css\",\n" +
                "  \"manifest.js\": \"manifest.e2ddacee727974fb35c9.js\",\n" +
                "  \"money-vendor.js\": \"money-vendor.a7e1465a241a7786bbfa.js\",\n" +
                "  \"money.css\": \"money.51b90bb745930b882ec791a146b69f5a.css\",\n" +
                "  \"money.js\": \"money.a28a30c0c8dc60927c82.js\",\n" +
                "  \"money.logos.css\": \"money.logos.51b90bb745930b882ec791a146b69f5a.css\",\n" +
                "  \"narrative-editor-vendor.js\": \"narrative-editor-vendor.1d95f9a3644f13adb1b9.js\",\n" +
                "  \"narrative-editor.css\": \"narrative-editor.2360039becbc80dab15ca716835307d2.css\",\n" +
                "  \"narrative-editor.js\": \"narrative-editor.addeccb8c16f25fd5914.js\",\n" +
                "  \"narrative-editor.logos.css\": \"narrative-editor.logos.2360039becbc80dab15ca716835307d2.css\",\n" +
                "  \"narrative-vendor.js\": \"narrative-vendor.be9cee7824e1a2e4d951.js\",\n" +
                "  \"narrative.css\": \"narrative.9b9763d8629b9564a6b329cc1f5a5b27.css\",\n" +
                "  \"narrative.js\": \"narrative.613410133b083dae6f75.js\",\n" +
                "  \"narrative.logos.css\": \"narrative.logos.9b9763d8629b9564a6b329cc1f5a5b27.css\",\n" +
                "  \"publications-vendor.js\": \"publications-vendor.97edd146a3873103a36d.js\",\n" +
                "  \"publications.css\": \"publications.1a4b32b4dd14f341c29158e5d5f9fa0e.css\",\n" +
                "  \"publications.js\": \"publications.3a06b4b9369b00aefd72.js\",\n" +
                "  \"publications.logos.css\": \"publications.logos.1a4b32b4dd14f341c29158e5d5f9fa0e.css\",\n" +
                "  \"widget-statistic-vendor.js\": \"widget-statistic-vendor.bc834d7457fab7305a17.js\",\n" +
                "  \"widget-statistic.css\": \"widget-statistic.c919196fed4cf5892a271c3f8e056aee.css\",\n" +
                "  \"widget-statistic.js\": \"widget-statistic.0b0f5cb0737ff68bf56c.js\",\n" +
                "  \"widget-statistic.logos.css\": \"widget-statistic.logos.c919196fed4cf5892a271c3f8e056aee.css\"\n" +
                "}; window._manifestHashesLegacy = {\n" +
                "  \"article-editor-vendor.js\": \"article-editor-vendor.legacy.cceccfda2e65f0004129.js\",\n" +
                "  \"article-editor.js\": \"article-editor.legacy.6797c9be788d2b8b5a3f.js\",\n" +
                "  \"article-vendor.js\": \"article-vendor.legacy.0a33c1ae793a97a6253a.js\",\n" +
                "  \"article-video-vendor.js\": \"article-video-vendor.legacy.af4aaa302f625cdc590b.js\",\n" +
                "  \"article-video.js\": \"article-video.legacy.975e47f9405631f2249a.js\",\n" +
                "  \"article.js\": \"article.legacy.4fc52fd91a4a6f25daae.js\",\n" +
                "  \"hls-light.js\": \"legacy.6a5d87150e6b94e5d217.js\",\n" +
                "  \"karma-vendor.js\": \"karma-vendor.legacy.87cf816a2ca4fbfe628a.js\",\n" +
                "  \"karma.js\": \"karma.legacy.590dbcfccfb19656a851.js\",\n" +
                "  \"login-vendor.js\": \"login-vendor.legacy.d13428444a6370827cd2.js\",\n" +
                "  \"login.js\": \"login.legacy.980efd896c81eabf0aa4.js\",\n" +
                "  \"manifest.js\": \"manifest.legacy.a702545b2c001d9e5805.js\",\n" +
                "  \"money-vendor.js\": \"money-vendor.legacy.543930ff657fe09469b8.js\",\n" +
                "  \"money.js\": \"money.legacy.62a75f069c5d7b3b09c5.js\",\n" +
                "  \"narrative-editor-vendor.js\": \"narrative-editor-vendor.legacy.8cf4ab1a9fca5a8660dd.js\",\n" +
                "  \"narrative-editor.js\": \"narrative-editor.legacy.fc9ec15a067ddaa7a5a5.js\",\n" +
                "  \"narrative-vendor.js\": \"narrative-vendor.legacy.5b7f787cb77b8a9862bf.js\",\n" +
                "  \"narrative.js\": \"narrative.legacy.c78d0ca0e7ba1053898f.js\",\n" +
                "  \"publications-vendor.js\": \"publications-vendor.legacy.7b876b36e33d3d462bfe.js\",\n" +
                "  \"publications.js\": \"publications.legacy.e7a91a75ae0770d8b952.js\",\n" +
                "  \"widget-statistic-vendor.js\": \"widget-statistic-vendor.legacy.50b2d38bb672e770a7c8.js\",\n" +
                "  \"widget-statistic.js\": \"widget-statistic.legacy.6d99123affe9179e03ca.js\"\n" +
                "};</script>\n" +
                "\n" +
                "        <script nonce=\"\">\n" +
                "    var staticBase = '//yastatic.net/zen-publishers/';\n" +
                "    var search = location.search;\n" +
                "    var isLegacy = false;\n" +
                "    if (search.indexOf('es-legacy') !== -1) {\n" +
                "        isLegacy = true;\n" +
                "    } else if (search.indexOf('es-modern') !== -1) {\n" +
                "        isLegacy = false;\n" +
                "    } else {\n" +
                "        try {\n" +
                "            eval('async function a(bar=\"test\", ...args){return {...{foo: 1**2}}}');\n" +
                "            isLegacy = false;\n" +
                "        } catch(e) {\n" +
                "            isLegacy = true;\n" +
                "        }\n" +
                "    }\n" +
                "    var manifestHashes = isLegacy ? window._manifestHashesLegacy : window._manifestHashes;\n" +
                "    window._isLegacy = isLegacy;\n" +
                "    var bundleName = window._bundleName;\n" +
                "    var mainScriptName = bundleName + '.js';\n" +
                "    var vendorScriptName = bundleName + '-vendor' + '.js';\n" +
                "    var manifestScriptName = 'manifest' + '.js';\n" +
                "    var scriptsToAppend = [\n" +
                "        manifestScriptName,\n" +
                "        vendorScriptName,\n" +
                "        mainScriptName,\n" +
                "    ].map(function(scriptName) {\n" +
                "        return staticBase + 'auto/' + (manifestHashes[scriptName] || scriptName);\n" +
                "    });\n" +
                "    scriptsToAppend.forEach(function (scriptPath) {\n" +
                "        var script = document.createElement('script');\n" +
                "        script.defer = true;\n" +
                "        script.src = scriptPath;\n" +
                "        document.write(script.outerHTML);\n" +
                "    });\n" +
                "</script><script defer=\"\" src=\"//yastatic.net/zen-publishers/auto/manifest.e2ddacee727974fb35c9.js\"></script><script defer=\"\" src=\"//yastatic.net/zen-publishers/auto/article-vendor.d5cd7aa50556720249a7.js\"></script><script defer=\"\" src=\"//yastatic.net/zen-publishers/auto/article.2e363a14c40d21f7fcf6.js\"></script><script defer=\"\" src=\"//yastatic.net/zen-publishers/auto/manifest.e2ddacee727974fb35c9.js\"></script><script defer=\"\" src=\"//yastatic.net/zen-publishers/auto/article-vendor.d5cd7aa50556720249a7.js\"></script><script defer=\"\" src=\"//yastatic.net/zen-publishers/auto/article.2e363a14c40d21f7fcf6.js\"></script><script defer=\"\" src=\"//yastatic.net/zen-publishers/auto/manifest.e2ddacee727974fb35c9.js\"></script><script defer=\"\" src=\"//yastatic.net/zen-publishers/auto/article-vendor.d5cd7aa50556720249a7.js\"></script><script defer=\"\" src=\"//yastatic.net/zen-publishers/auto/article.2e363a14c40d21f7fcf6.js\"></script>\n" +
                "\n" +
                "    <script nonce=\"\">\n" +
                "(function() {\n" +
                "    // delete utm_referrer not to spoil statistic\n" +
                "    var search = location.search.replace(/&?\\butm_referrer=[^&#]+/, '');\n" +
                "    // delete rid not to spoil statistic and save it to use in statistic\n" +
                "    var ridPattern = /&?\\brid=([^&#]+)/;\n" +
                "    var matches = search.match(ridPattern);\n" +
                "    if (matches) {\n" +
                "        var rid = matches[1];\n" +
                "        window.zenInitialRid = rid;\n" +
                "        search = search.replace(ridPattern, '').trim();\n" +
                "        search = search === '?' ? '' : search;\n" +
                "    }\n" +
                "    if (search !== location.search && history.replaceState) {\n" +
                "        window._originalStartUrl = location.href;\n" +
                "        history.replaceState({}, document.title, location.pathname + search + location.hash);\n" +
                "    }\n" +
                "})();\n" +
                "</script>\n" +
                "\n" +
                "        <link rel=\"shortcut icon\" href=\"//yastatic.net/zen-publishers/favicons/favicon_blue_16.png\" sizes=\"16x16\">\n" +
                "<link rel=\"shortcut icon\" href=\"//yastatic.net/zen-publishers/favicons/favicon_blue_32.png\" sizes=\"32x32\">\n" +
                "<link rel=\"shortcut icon\" href=\"//yastatic.net/zen-publishers/favicons/favicon_blue_96.png\" sizes=\"96x96\">\n" +
                "<link rel=\"shortcut icon\" href=\"//yastatic.net/zen-publishers/favicons/favicon_blue_160.png\" sizes=\"160x160\">\n" +
                "<link rel=\"shortcut icon\" href=\"//yastatic.net/zen-publishers/favicons/favicon_blue_196.png\" sizes=\"196x196\">\n" +
                "<link rel=\"icon\" href=\"//yastatic.net/zen-publishers/favicons/favicon_blue.svg\" type=\"image/svg+xml\" sizes=\"any\">\n" +
                "\n" +
                "            <!-- Yandex.Metrika counter -->\n" +
                "<script nonce=\"\">\n" +
                "    (function (d, w, c) {\n" +
                "        (w[c] = w[c] || []).push(function () {\n" +
                "\n" +
                "            var params = {\n" +
                "                modern_js: !Boolean(window._isLegacy),\n" +
                "            };\n" +
                "\n" +
                "            try {\n" +
                "                w.yaCounter45081660 = new Ya.Metrika2({\n" +
                "                    id: 45081660,\n" +
                "                    clickmap: true,\n" +
                "                    trackLinks: true,\n" +
                "                    accurateTrackBounce: true,\n" +
                "                    params: params,\n" +
                "                });\n" +
                "                w.mainYaCounter = yaCounter45081660;\n" +
                "            } catch (e) {\n" +
                "            }\n" +
                "        });\n" +
                "        var n = d.getElementsByTagName(\"script\")[0], s = d.createElement(\"script\"), f = function () {\n" +
                "            n.parentNode.insertBefore(s, n);\n" +
                "        };\n" +
                "        s.type = \"text/javascript\";\n" +
                "        s.async = true;\n" +
                "        s.src = \"https://mc.yandex.ru/metrika/tag.js\";\n" +
                "        if (w.opera == \"[object Opera]\") {\n" +
                "            d.addEventListener(\"DOMContentLoaded\", f, false);\n" +
                "        } else {\n" +
                "            f();\n" +
                "        }\n" +
                "    })(document, window, \"yandex_metrika_callbacks2\");\n" +
                "</script>\n" +
                "<noscript>\n" +
                "   \n" +
                "</noscript>\n" +
                "<!-- /Yandex.Metrika counter -->\n" +
                "\n" +
                "</head>\n" +
                "<body class=\"page page_article\">\n" +
                "    <!--noindex-->\n" +
                "<!--googleoff: all-->\n" +
                "\n" +
                "<!--googleon: all-->\n" +
                "<!--/noindex-->\n" +
                "<script nonce=\"\">\n" +
                "    (function () {\n" +
                "        function _getJsonData(name) {\n" +
                "            return JSON.parse(document.getElementById(name).defaultValue);\n" +
                "        }\n" +
                "        window._getJsonData = _getJsonData;\n" +
                "        window._data = _getJsonData('init_data');\n" +
                "        window._uatraits = _getJsonData('uatraits');\n" +
                "        window._config = _getJsonData('config');\n" +
                "        window._csrfToken = csrfToken.value.trim();\n" +
                "        window._zenUserData = _getJsonData('zenUserData');\n" +
                "        window._isZenKit = isZenKit.textContent.trim() == 'true';\n" +
                "        window._yaNonce = 'eVjJk6jbQ2oJ1l6Lu9OU';\n" +
                "\n" +
                "        document.body.removeChild(document.getElementById('all-data'));\n" +
                "    })();\n" +
                "</script>\n" +
                "\n" +
                "    \n" +
                "<script nonce=\"\">\n" +
                "    (function () {\n" +
                "        window._translations = window._getJsonData('translations');\n" +
                "    })();\n" +
                "</script>\n" +
                "\n" +
                "    \n" +
                "        <article class=\"article\" itemscope=\"\" itemtype=\"http://schema.org/Article\">\n" +
                "            <div class=\"article__content\">\n" +
                "                \n" +
                "                <div class=\"article__middle\">\n" +
                "                    <div class=\"article__zoom-overlay\"></div><h1 class=\"article__title\" itemprop=\"headline\">Электричество доступным языком. Как в нем разобраться?</h1>\n" +
                "    <div itemprop=\"articleBody\">\n" +
                "        <p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 600px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac0f23c256d5cfc635d320a_5ac10b58dcaf8ec068a92f21\"><img itemprop=\"image\" class=\"article-block-image__image \" src=\"https://avatars.mds.yandex.net/get-zen_doc/920263/pub_5ac0f23c256d5cfc635d320a_5ac10b58dcaf8ec068a92f21/scale_600\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/920263/pub_5ac0f23c256d5cfc635d320a_5ac10b58dcaf8ec068a92f21/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/920263/pub_5ac0f23c256d5cfc635d320a_5ac10b58dcaf8ec068a92f21/scale_1200 2x\" alt=\"\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\">Многие, увидев, в первый раз какую-нибудь сложную схему, прочитав какие-то непонятные термины и названия очень быстро теряют интерес к этому и просто отступают. Я хочу доказать что, электричество это не так уж и сложно, как может показаться на первый взгляд.\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\"> <strong>Прежде всего стоит понять, что же такое электричество?</strong> \n" +
                "</p>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Электричество или электрический ток</strong> - <u>это упорядоченное (направленное) движение свободных заряженных частиц.</u>\n" +
                "</blockquote>\n" +
                "<p class=\"article-block article-block-unstyled\">Ток течет по проводникам. Провода это тоже проводники.\n" +
                "</p>\n" +
                "<blockquote class=\"article-block article-block-quote\">Вещества, в которых есть свободно заряженные частицы -  называются<strong> проводники</strong>. Пример: все металлы, вода\n" +
                "</blockquote>\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<blockquote class=\"article-block article-block-quote\">Вещества, в которых практически отсутствуют свободно заряженные частицы - называются <strong>диэлектриками</strong>. Пример: <i>дистиллированная</i> вода, воздух, дерево, стекло, пластик, бумага.\n" +
                "</blockquote>\n" +
                "<p class=\"article-block article-block-unstyled\"><strong>Свободно заряженные частицы в металлах - это </strong><strong><u>электроны</u></strong><strong>. Свободно заряженные частицы в электролитах - </strong><strong><u>положительные и отрицательные ионы.</u></strong>\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<h3 class=\"article-block\"><strong>Действия электрического тока:</strong>\n" +
                "</h3>\n" +
                "<p class=\"article-block article-block-unstyled\"><strong>1)Тепловое действие. </strong>Если по проводнику протекает электрический ток, то проводник нагревается.\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\"><strong>2) Химическое действие тока(электролиз). </strong>Прохождение тока через электролиты сопровождается окислительно - восстановительными химическими реакциями.\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\"><strong>3) Магнитное действие тока. </strong>Проводник с током проявляет магнитные свойства:<strong> ведет себя подобно магниту.</strong>\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\"><strong>Ток возникает благодаря источникам тока.</strong>\n" +
                "</p>\n" +
                "\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Источники тока -</strong> это устройства, создающие длительное время электрическое поле.\n" +
                "</blockquote>\n" +
                "<blockquote class=\"article-block article-block-quote\">Например: аккумулятор, электрогенератор.\n" +
                "</blockquote>\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\">Замечали ли Вы сколько включается лампочка в вашей квартире при нажатии на выключатель? Очень быстро, не правда ли? <strong>А это все потому, что скорость тока близка к скорости света в вакууме (300 000 км/c).</strong>\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\"><strong><br></strong>\n" +
                "</p>\n" +
                "<h3 class=\"article-block\"><strong>Использование тока.</strong>\n" +
                "</h3>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Потребители электрического тока - </strong>приборы, в которых применяют действие электрического тока.\n" +
                "</blockquote>\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 960px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac0f23c256d5cfc635d320a_5ac1061d9f43472248ac7751\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/1247665/pub_5ac0f23c256d5cfc635d320a_5ac1061d9f43472248ac7751/scale_600\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/1247665/pub_5ac0f23c256d5cfc635d320a_5ac1061d9f43472248ac7751/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/1247665/pub_5ac0f23c256d5cfc635d320a_5ac1061d9f43472248ac7751/scale_1200 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/1247665/pub_5ac0f23c256d5cfc635d320a_5ac1061d9f43472248ac7751/scale_600\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/1247665/pub_5ac0f23c256d5cfc635d320a_5ac1061d9f43472248ac7751/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/1247665/pub_5ac0f23c256d5cfc635d320a_5ac1061d9f43472248ac7751/scale_1200 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\">Как мы знаем свет в доме у нас работает не все время, это значит что его что-то включает и выключает.\n" +
                "</p>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Замыкающие или размыкающие устройства -</strong> устройства, служащие для включения или отключения электроприборов.\n" +
                "</blockquote>\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 481px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac0f23c256d5cfc635d320a_5ac1097ba936f4806a30ebac\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/118017/pub_5ac0f23c256d5cfc635d320a_5ac1097ba936f4806a30ebac/scale_600\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/118017/pub_5ac0f23c256d5cfc635d320a_5ac1097ba936f4806a30ebac/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/118017/pub_5ac0f23c256d5cfc635d320a_5ac1097ba936f4806a30ebac/scale_1200 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/118017/pub_5ac0f23c256d5cfc635d320a_5ac1097ba936f4806a30ebac/scale_600\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/118017/pub_5ac0f23c256d5cfc635d320a_5ac1097ba936f4806a30ebac/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/118017/pub_5ac0f23c256d5cfc635d320a_5ac1097ba936f4806a30ebac/scale_1200 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\"><strong>Теперь если мы соединим между собой проводами источник тока, замыкающее устройство и потребитель,  то получим </strong><strong><u>электрическую цепь.</u></strong>\n" +
                "</p>\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 800px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac0f23c256d5cfc635d320a_5ac10b0b9f43472248ac7797\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/40170/pub_5ac0f23c256d5cfc635d320a_5ac10b0b9f43472248ac7797/scale_600\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/40170/pub_5ac0f23c256d5cfc635d320a_5ac10b0b9f43472248ac7797/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/40170/pub_5ac0f23c256d5cfc635d320a_5ac10b0b9f43472248ac7797/scale_1200 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/40170/pub_5ac0f23c256d5cfc635d320a_5ac10b0b9f43472248ac7797/scale_600\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/40170/pub_5ac0f23c256d5cfc635d320a_5ac10b0b9f43472248ac7797/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/40170/pub_5ac0f23c256d5cfc635d320a_5ac10b0b9f43472248ac7797/scale_1200 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<blockquote class=\"article-block article-block-quote\"><strong>Электрическая схема - </strong>чертеж, на котором изображена электрическая цепь с помощью условных обозначений элементов этой цепи.\n" +
                "</blockquote>\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "<figure class=\"article-block article-block-image\" itemscope=\"\" itemtype=\"http://schema.org/ImageObject\"><div class=\"article-block-image__container\" style=\"max-width: 960px;\"><div class=\"article-block-image__zoom\" id=\"pub_5ac0f23c256d5cfc635d320a_5ac10a703dceb733d3dc724f\"><img itemprop=\"image\" class=\"article-block-image__image lazy-image lazy-image_loaded\" data-src=\"https://avatars.mds.yandex.net/get-zen_doc/916951/pub_5ac0f23c256d5cfc635d320a_5ac10a703dceb733d3dc724f/scale_600\" data-srcset=\"https://avatars.mds.yandex.net/get-zen_doc/916951/pub_5ac0f23c256d5cfc635d320a_5ac10a703dceb733d3dc724f/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/916951/pub_5ac0f23c256d5cfc635d320a_5ac10a703dceb733d3dc724f/scale_1200 2x\" alt=\"\" src=\"https://avatars.mds.yandex.net/get-zen_doc/916951/pub_5ac0f23c256d5cfc635d320a_5ac10a703dceb733d3dc724f/scale_600\" srcset=\"https://avatars.mds.yandex.net/get-zen_doc/916951/pub_5ac0f23c256d5cfc635d320a_5ac10a703dceb733d3dc724f/scale_600 1x, https://avatars.mds.yandex.net/get-zen_doc/916951/pub_5ac0f23c256d5cfc635d320a_5ac10a703dceb733d3dc724f/scale_1200 2x\"></div></div><figcaption class=\"article-block-image__caption\"></figcaption></figure>\n" +
                "\n" +
                "<p class=\"article-block article-block-unstyled\">\n" +
                "</p>\n" +
                "\n" +
                "\n" +
                "    </div>\n" +
                "\n" +
                "\n" +
                "                </div>\n" +
                "                \n" +
                "            </div>\n" +
                "        </article>\n" +
                "        \n" +
                "\n" +
                "    \n" +
                "\n" +
                "        <link rel=\"stylesheet\" href=\"//yastatic.net/zen-publishers/auto/article.logos.0ecfe427cd4f05eeb414f7cbb7d92ec7.css\">\n" +
                "\n" +
                "    <script src=\"//yastatic.net/zen-publishers/auto/client-errors.js?1524928332478\" defer=\"\"></script>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div style=\"position: fixed; left: -99px;\"><div id=\"sf-3909633705\" style=\"width: 1px; height: 1px; position: relative;\"><iframe frameborder=\"no\" scrolling=\"no\" allowtransparency=\"true\" hidefocus=\"true\" tabindex=\"-1\" marginwidth=\"0\" marginheight=\"0\" name=\"%7B%22id%22%3A%22sf-3909633705%22%2C%22html%22%3A%22%3Cscript%3Evar%20config%3D%7B%5C%22rtb%5C%22%3A%7B%5C%22matchUrls%5C%22%3A%5B%5C%22https%3A%2F%2Fan.yandex.ru%2Fmapuid%2Fbidswitch%2F%5C%22%2C%5C%22https%3A%2F%2Fan.yandex.ru%2Fmapuid%2Frubicon%2F%5C%22%2C%5C%22https%3A%2F%2Fan.yandex.ru%2Fmapuid%2Fgoogle%2F%5C%22%2C%5C%22https%3A%2F%2Fdmg.digitaltarget.ru%2F1%2F119%2Fi%2Fi%3Fi%3D1525814411%5C%22%2C%5C%22https%3A%2F%2Fyandex-dmp-sync.rutarget.ru%2Fsync%5C%22%2C%5C%22https%3A%2F%2Fyandex-sync.rutarget.ru%2Fsync%5C%22%2C%5C%22https%3A%2F%2Fx01.aidata.io%2F0.gif%3Fpid%3DYANDEX%5C%22%2C%5C%22https%3A%2F%2Fsync.1dmp.io%2Fpixel.gif%3Fcid%3D3cbc2ec8-1421-4677-89fe-2ac6fc52a09a%26pid%3Dw%26o%3Dau%5C%22%2C%5C%22https%3A%2F%2Fredirect.frontend.weborama.fr%2Fredirect%2Fstandard%3Furl%3Dhttps%3A%2F%2Fan.yandex.ru%2Fmapuid%2Fdmpweborama%2F%7BWEBO_CID%7D%5C%22%2C%5C%22https%3A%2F%2Ffront.facetz.net%2Fcollect%3Fsync_redirect%3Dyandexdmp%5C%22%5D%7D%7D%3C%2Fscript%3E%3Cscript%3E%5C%22use%20strict%5C%22%3Bfunction%20t(t%2Ce%2Cn)%7Bvar%20s%3Dt%2B%5C%22%3D1%5C%22%3Bif(-1%3D%3D%3Ddocument.cookie.indexOf(s))%7Bvar%20a%3D86400*e*1e3%2Cc%3Dnew%20Date%2Cr%3Dnew%20Date(Number(c)%2Ba).toUTCString()%3Bdocument.cookie%3Ds%2B%5C%22%3B%20expires%3D%5C%22%2Br%2Cn()%7D%7Dfunction%20e(t)%7B(new%20Image).src%3Dt%7Dif(config.rtb)%7Bvar%20n%3Dconfig.rtb.matchUrls%3Bt(%5C%22pcs3%5C%22%2C1%2Cfunction()%7Bvar%20t%2Ce%3Bt%3D%5C%22https%3A%2F%2Fyastatic.net%2Fq%2Fset%2Fs%2Frsya-tag-users%2Fbundle.js%5C%22%2C(e%3Ddocument.createElement(%5C%22script%5C%22)).src%3Dt%2Cdocument.body.appendChild(e)%7D)%2Cs%3D.2%2CMath.random()%3Cs%26%26t(%5C%22pcssspb%5C%22%2C14%2Cfunction()%7Bfor(var%20t%3D0%3Bt%3Cn.length%3Bt%2B%2B)e(n%5Bt%5D)%7D)%2Ce(%5C%22https%3A%2F%2Fysa-static.passport.yandex.ru%2Fstatic%2F1%2Fd959d7e39d5067fad30d9c06204866e9%2Fd.png%3Fex%3Dyes%5C%22)%7Dvar%20s%3B%3C%2Fscript%3E%22%2C%22pmGuid%22%3A%22_1525814405902_7_3%22%2C%22geom%22%3A%7B%22win%22%3A%7B%22t%22%3A0%2C%22l%22%3A0%2C%22w%22%3A1280%2C%22h%22%3A918%2C%22b%22%3A918%2C%22r%22%3A1280%7D%2C%22self%22%3A%7B%22t%22%3A4564%2C%22l%22%3A-99%2C%22b%22%3A4565%2C%22r%22%3A-98%2C%22w%22%3A1%2C%22h%22%3A1%2C%22xiv%22%3A0%2C%22yiv%22%3A0%2C%22iv%22%3A0%2C%22z%22%3A0%7D%2C%22exp%22%3A%7B%22t%22%3A4564%2C%22l%22%3A0%2C%22r%22%3A1378%2C%22b%22%3A0%2C%22xs%22%3A0%2C%22ys%22%3A0%7D%7D%2C%22hasFocus%22%3Atrue%2C%22supports%22%3A%7B%22exp-ovr%22%3Atrue%2C%22exp-push%22%3Afalse%2C%22read-cookie%22%3Afalse%2C%22write-cookie%22%3Afalse%7D%2C%22css%22%3A%22%22%2C%22bg%22%3A%22transparent%22%2C%22posMeta%22%3A%7B%22sharedData%22%3A%7B%22sf_ver%22%3A%221-1-0%22%2C%22ck_o%22%3A1%2C%22flash_ver%22%3A0%7D%2C%22ownerKey%22%3A%22%22%2C%22privateData%22%3A%7B%7D%7D%2C%22target%22%3A%22_blank%22%2C%22basePath%22%3A%22%22%7D\" src=\"//yastatic.net/safeframe-bundles/0.33/1-1-0/render.html\" width=\"1\" height=\"1\" style=\"width: 1px; height: 1px; top: 0px; left: 0px; position: absolute;\"></iframe></div></div><yatag style=\"overflow: hidden !important; position: absolute !important; left: -9999px !important; top: -9999px !important; width: 1px !important; height: 1px !important;\"><iframe id=\"\" width=\"1\" height=\"1\" sandbox=\"allow-same-origin allow-scripts\" scrolling=\"no\" marginwidth=\"0\" marginheight=\"0\" frameborder=\"0\" vspace=\"0\" hspace=\"0\" src=\"https://st.yandexadexchange.net/confirm_r_4897.html\"></iframe></yatag></body></html>";
        WebView webView = new WebView(this);
        setContentView(webView);
        webView.loadData(s,"text/html; charset=utf-8", "utf-8");

    }

}
