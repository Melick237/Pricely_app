package de.thb.pricely.general;

import de.thb.pricely.products.entities.Category;
import de.thb.pricely.products.entities.Product;
import de.thb.pricely.products.services.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Initializer {
    private static final Logger LOG = LoggerFactory.getLogger(Initializer.class);

    public ProductService productService;

    @Autowired
    public Initializer(ProductService productService, final @Value("${initialize}") boolean initialize) {
        this.productService = productService;

        if(initialize)
            setupDemoProducts();
    }

    public void setupDemoProducts(){
        LOG.info("Setup demo Products");

        // Café
        productService.save(new Product(35L, "Tiga Terra Kaffee & Espresso",
                "/img/products/cafe1.jpg", "Der Tiga Terra ist der beste" +
                " Kaffee für den Vollautomaten! Über viele Monate haben wir" +
                " gemeinsam mit Kunden an der Rezeptur des Kaffees gefeilt." +
                " Der Blend aus Brasilien, Indonesien und Uganda eignet sich für " +
                "jede Getränkezubereitung im Vollautomaten, von Café Crème, " +
                "Espresso bis hin zu Milchgetränken.",
                Category.cafe,
                "Coffe Circle",
                "https://www.coffeecircle.com/de/p/tiga-terra?number=K071-1000-001&gclid=Cj0KCQiAzfuNBhCGARIsAD1nu-8FHfp-wlZl3DdHZn63wj7OUaH-s32nkP_G5QalTQKaFLM1qmkQNtsaAiGHEALw_wcB"));

        productService.save(new Product(112L, "Tiga Terra Kaffee & Espresso",
                "/img/products/cafe1.jpg", "Der Tiga Terra ist der beste" +
                " Kaffee für den Vollautomaten! Über viele Monate haben wir" +
                " gemeinsam mit Kunden an der Rezeptur des Kaffees gefeilt." +
                " Der Blend aus Brasilien, Indonesien und Uganda eignet sich für " +
                "jede Getränkezubereitung im Vollautomaten, von Café Crème, " +
                "Espresso bis hin zu Milchgetränken.",
                Category.cafe,
                "Coffe Circle",
                "https://www.coffeecircle.com/de/p/tiga-terra?number=K071-1000-001&gclid=Cj0KCQiAzfuNBhCGARIsAD1nu-8FHfp-wlZl3DdHZn63wj7OUaH-s32nkP_G5QalTQKaFLM1qmkQNtsaAiGHEALw_wcB"));


        productService.save(new Product(90L, "Tiga Terra Kaffee & Espresso",
                "/img/products/cafe1.jpg", "Der Tiga Terra ist der beste" +
                " Kaffee für den Vollautomaten! Über viele Monate haben wir" +
                " gemeinsam mit Kunden an der Rezeptur des Kaffees gefeilt." +
                " Der Blend aus Brasilien, Indonesien und Uganda eignet sich für " +
                "jede Getränkezubereitung im Vollautomaten, von Café Crème, " +
                "Espresso bis hin zu Milchgetränken.",
                Category.cafe,
                "Coffe Circle",
                "https://www.coffeecircle.com/de/p/tiga-terra?number=K071-1000-001&gclid=Cj0KCQiAzfuNBhCGARIsAD1nu-8FHfp-wlZl3DdHZn63wj7OUaH-s32nkP_G5QalTQKaFLM1qmkQNtsaAiGHEALw_wcB"));


        productService.save(new Product(66L, "Tiga Terra Kaffee & Espresso",
                "/img/products/cafe1.jpg", "Der Tiga Terra ist der beste" +
                " Kaffee für den Vollautomaten! Über viele Monate haben wir" +
                " gemeinsam mit Kunden an der Rezeptur des Kaffees gefeilt." +
                " Der Blend aus Brasilien, Indonesien und Uganda eignet sich für " +
                "jede Getränkezubereitung im Vollautomaten, von Café Crème, " +
                "Espresso bis hin zu Milchgetränken.",
                Category.cafe,
                "Coffe Circle",
                "https://www.coffeecircle.com/de/p/tiga-terra?number=K071-1000-001&gclid=Cj0KCQiAzfuNBhCGARIsAD1nu-8FHfp-wlZl3DdHZn63wj7OUaH-s32nkP_G5QalTQKaFLM1qmkQNtsaAiGHEALw_wcB"));


        productService.save(new Product(1235L, "Tiga Terra Kaffee & Espresso",
                "/img/products/cafe1.jpg", "Der Tiga Terra ist der beste" +
                " Kaffee für den Vollautomaten! Über viele Monate haben wir" +
                " gemeinsam mit Kunden an der Rezeptur des Kaffees gefeilt." +
                " Der Blend aus Brasilien, Indonesien und Uganda eignet sich für " +
                "jede Getränkezubereitung im Vollautomaten, von Café Crème, " +
                "Espresso bis hin zu Milchgetränken.",
                Category.cafe,
                "Coffe Circle",
                "https://www.coffeecircle.com/de/p/tiga-terra?number=K071-1000-001&gclid=Cj0KCQiAzfuNBhCGARIsAD1nu-8FHfp-wlZl3DdHZn63wj7OUaH-s32nkP_G5QalTQKaFLM1qmkQNtsaAiGHEALw_wcB"));


        productService.save(new Product(45L, "Tiga Terra Kaffee & Espresso",
                "/img/products/cafe1.jpg", "Der Tiga Terra ist der beste" +
                " Kaffee für den Vollautomaten! Über viele Monate haben wir" +
                " gemeinsam mit Kunden an der Rezeptur des Kaffees gefeilt." +
                " Der Blend aus Brasilien, Indonesien und Uganda eignet sich für " +
                "jede Getränkezubereitung im Vollautomaten, von Café Crème, " +
                "Espresso bis hin zu Milchgetränken.",
                Category.cafe,
                "Coffe Circle",
                "https://www.coffeecircle.com/de/p/tiga-terra?number=K071-1000-001&gclid=Cj0KCQiAzfuNBhCGARIsAD1nu-8FHfp-wlZl3DdHZn63wj7OUaH-s32nkP_G5QalTQKaFLM1qmkQNtsaAiGHEALw_wcB"));

        // Noodle

        productService.save(new Product(5L, "Nissin Ramen",
                "/img/products/noodle1.jpg", "Nissin Demae Ramen – Rind, Einzelpack, Instant-Nudeln japanischer Art, mit Rindfleisch-Geschmack & asiatischen Gewürzen, schnell & einfach zubereitet, asiatisches Essen",
                Category.noodle,
                "Amazon",
                "https://www.amazon.de/Nissin-Ramen-Rind-100-g/dp/B01E7A3GK4/ref=sr_1_1_sspa?adgrpid=69053917417&gclid=Cj0KCQiAzfuNBhCGARIsAD1nu--plTn4UgYpj0Fel8QJGmCF72mZgYM7wHgxP9EvwbEXzethlOJb2BUaAsfNEALw_wcB&hvadid=352731474362&hvdev=c&hvlocphy=9043176&hvnetw=g&hvqmt=b&hvrand=12232904580141376270&hvtargid=kwd-300153327280&hydadcr=8170_1722675&keywords=instant+ramen&qid=1639915216&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzOU5TVlpCTUFYMUVIJmVuY3J5cHRlZElkPUEwMTQyNjAyMUFaNlRWUlBHNFAwTCZlbmNyeXB0ZWRBZElkPUEwODMyODI5M0JYR05HV0JRRDVTMyZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU="));

        productService.save(new Product(15L, "Nissin Ramen",
                "/img/products/noodle1.jpg", "Nissin Demae Ramen – Rind, Einzelpack, Instant-Nudeln japanischer Art, mit Rindfleisch-Geschmack & asiatischen Gewürzen, schnell & einfach zubereitet, asiatisches Essen",
                Category.noodle,
                "Amazon",
                "https://www.amazon.de/Nissin-Ramen-Rind-100-g/dp/B01E7A3GK4/ref=sr_1_1_sspa?adgrpid=69053917417&gclid=Cj0KCQiAzfuNBhCGARIsAD1nu--plTn4UgYpj0Fel8QJGmCF72mZgYM7wHgxP9EvwbEXzethlOJb2BUaAsfNEALw_wcB&hvadid=352731474362&hvdev=c&hvlocphy=9043176&hvnetw=g&hvqmt=b&hvrand=12232904580141376270&hvtargid=kwd-300153327280&hydadcr=8170_1722675&keywords=instant+ramen&qid=1639915216&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzOU5TVlpCTUFYMUVIJmVuY3J5cHRlZElkPUEwMTQyNjAyMUFaNlRWUlBHNFAwTCZlbmNyeXB0ZWRBZElkPUEwODMyODI5M0JYR05HV0JRRDVTMyZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU="));

        productService.save(new Product(34L, "Nissin Ramen",
                "/img/products/noodle1.jpg", "Nissin Demae Ramen – Rind, Einzelpack, Instant-Nudeln japanischer Art, mit Rindfleisch-Geschmack & asiatischen Gewürzen, schnell & einfach zubereitet, asiatisches Essen",
                Category.noodle,
                "Amazon",
                "https://www.amazon.de/Nissin-Ramen-Rind-100-g/dp/B01E7A3GK4/ref=sr_1_1_sspa?adgrpid=69053917417&gclid=Cj0KCQiAzfuNBhCGARIsAD1nu--plTn4UgYpj0Fel8QJGmCF72mZgYM7wHgxP9EvwbEXzethlOJb2BUaAsfNEALw_wcB&hvadid=352731474362&hvdev=c&hvlocphy=9043176&hvnetw=g&hvqmt=b&hvrand=12232904580141376270&hvtargid=kwd-300153327280&hydadcr=8170_1722675&keywords=instant+ramen&qid=1639915216&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzOU5TVlpCTUFYMUVIJmVuY3J5cHRlZElkPUEwMTQyNjAyMUFaNlRWUlBHNFAwTCZlbmNyeXB0ZWRBZElkPUEwODMyODI5M0JYR05HV0JRRDVTMyZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU="));

        productService.save(new Product(89L, "Nissin Ramen",
                "/img/products/noodle1.jpg", "Nissin Demae Ramen – Rind, Einzelpack, Instant-Nudeln japanischer Art, mit Rindfleisch-Geschmack & asiatischen Gewürzen, schnell & einfach zubereitet, asiatisches Essen",
                Category.noodle,
                "Amazon",
                "https://www.amazon.de/Nissin-Ramen-Rind-100-g/dp/B01E7A3GK4/ref=sr_1_1_sspa?adgrpid=69053917417&gclid=Cj0KCQiAzfuNBhCGARIsAD1nu--plTn4UgYpj0Fel8QJGmCF72mZgYM7wHgxP9EvwbEXzethlOJb2BUaAsfNEALw_wcB&hvadid=352731474362&hvdev=c&hvlocphy=9043176&hvnetw=g&hvqmt=b&hvrand=12232904580141376270&hvtargid=kwd-300153327280&hydadcr=8170_1722675&keywords=instant+ramen&qid=1639915216&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzOU5TVlpCTUFYMUVIJmVuY3J5cHRlZElkPUEwMTQyNjAyMUFaNlRWUlBHNFAwTCZlbmNyeXB0ZWRBZElkPUEwODMyODI5M0JYR05HV0JRRDVTMyZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU="));

        productService.save(new Product(105L, "Nissin Ramen",
                "/img/products/noodle1.jpg", "Nissin Demae Ramen – Rind, Einzelpack, Instant-Nudeln japanischer Art, mit Rindfleisch-Geschmack & asiatischen Gewürzen, schnell & einfach zubereitet, asiatisches Essen",
                Category.noodle,
                "Amazon",
                "https://www.amazon.de/Nissin-Ramen-Rind-100-g/dp/B01E7A3GK4/ref=sr_1_1_sspa?adgrpid=69053917417&gclid=Cj0KCQiAzfuNBhCGARIsAD1nu--plTn4UgYpj0Fel8QJGmCF72mZgYM7wHgxP9EvwbEXzethlOJb2BUaAsfNEALw_wcB&hvadid=352731474362&hvdev=c&hvlocphy=9043176&hvnetw=g&hvqmt=b&hvrand=12232904580141376270&hvtargid=kwd-300153327280&hydadcr=8170_1722675&keywords=instant+ramen&qid=1639915216&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzOU5TVlpCTUFYMUVIJmVuY3J5cHRlZElkPUEwMTQyNjAyMUFaNlRWUlBHNFAwTCZlbmNyeXB0ZWRBZElkPUEwODMyODI5M0JYR05HV0JRRDVTMyZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU="));

        // Muesli

        productService.save(new Product(7L, "Michas Müsli",
                "/img/products/muesli1.jpg", "Michas Müsli glänzt mit seinem fein nussigen Aroma und lässt sich vielseitig einsetzen. Du kannst damit beispielsweise ein leckeres Keimster-Bananenbrot, saftige Rote-Bete-Bratlinge, ein Foccacia oder sogar leckeres und sättigendes Brot zubereiten. Natürlich schmeckt es ebenso hervorragend mit frischem Obst oder ein paar Trockenfrüchten als Müsli. Auch geröstete Nüsse und Gewürze wie Zimt und Vanille runden den milden Geschmack ab.",
                Category.muesli,
                "Keimster",
                "https://keimster.de/produkt/michas-muesli-unsere-3-korn-proteinquelle/?gclid=Cj0KCQiAzfuNBhCGARIsAD1nu--DnmfJtANXwDeW4VFEeJsi9lS5oH2kETzNlK38x5nKDi9jP9wOIoYaAojnEALw_wcB"));

        productService.save(new Product(456L, "Michas Müsli",
                "/img/products/muesli1.jpg", "Michas Müsli glänzt mit seinem fein nussigen Aroma und lässt sich vielseitig einsetzen. Du kannst damit beispielsweise ein leckeres Keimster-Bananenbrot, saftige Rote-Bete-Bratlinge, ein Foccacia oder sogar leckeres und sättigendes Brot zubereiten. Natürlich schmeckt es ebenso hervorragend mit frischem Obst oder ein paar Trockenfrüchten als Müsli. Auch geröstete Nüsse und Gewürze wie Zimt und Vanille runden den milden Geschmack ab.",
                Category.muesli,
                "Keimster",
                "https://keimster.de/produkt/michas-muesli-unsere-3-korn-proteinquelle/?gclid=Cj0KCQiAzfuNBhCGARIsAD1nu--DnmfJtANXwDeW4VFEeJsi9lS5oH2kETzNlK38x5nKDi9jP9wOIoYaAojnEALw_wcB"));

        productService.save(new Product(123L, "Michas Müsli",
                "/img/products/muesli1.jpg", "Michas Müsli glänzt mit seinem fein nussigen Aroma und lässt sich vielseitig einsetzen. Du kannst damit beispielsweise ein leckeres Keimster-Bananenbrot, saftige Rote-Bete-Bratlinge, ein Foccacia oder sogar leckeres und sättigendes Brot zubereiten. Natürlich schmeckt es ebenso hervorragend mit frischem Obst oder ein paar Trockenfrüchten als Müsli. Auch geröstete Nüsse und Gewürze wie Zimt und Vanille runden den milden Geschmack ab.",
                Category.muesli,
                "Keimster",
                "https://keimster.de/produkt/michas-muesli-unsere-3-korn-proteinquelle/?gclid=Cj0KCQiAzfuNBhCGARIsAD1nu--DnmfJtANXwDeW4VFEeJsi9lS5oH2kETzNlK38x5nKDi9jP9wOIoYaAojnEALw_wcB"));

        productService.save(new Product(222L, "Michas Müsli",
                "/img/products/muesli1.jpg", "Michas Müsli glänzt mit seinem fein nussigen Aroma und lässt sich vielseitig einsetzen. Du kannst damit beispielsweise ein leckeres Keimster-Bananenbrot, saftige Rote-Bete-Bratlinge, ein Foccacia oder sogar leckeres und sättigendes Brot zubereiten. Natürlich schmeckt es ebenso hervorragend mit frischem Obst oder ein paar Trockenfrüchten als Müsli. Auch geröstete Nüsse und Gewürze wie Zimt und Vanille runden den milden Geschmack ab.",
                Category.muesli,
                "Keimster",
                "https://keimster.de/produkt/michas-muesli-unsere-3-korn-proteinquelle/?gclid=Cj0KCQiAzfuNBhCGARIsAD1nu--DnmfJtANXwDeW4VFEeJsi9lS5oH2kETzNlK38x5nKDi9jP9wOIoYaAojnEALw_wcB"));

        productService.save(new Product(30L, "Michas Müsli",
                "/img/products/muesli1.jpg", "Michas Müsli glänzt mit seinem fein nussigen Aroma und lässt sich vielseitig einsetzen. Du kannst damit beispielsweise ein leckeres Keimster-Bananenbrot, saftige Rote-Bete-Bratlinge, ein Foccacia oder sogar leckeres und sättigendes Brot zubereiten. Natürlich schmeckt es ebenso hervorragend mit frischem Obst oder ein paar Trockenfrüchten als Müsli. Auch geröstete Nüsse und Gewürze wie Zimt und Vanille runden den milden Geschmack ab.",
                Category.muesli,
                "Keimster",
                "https://keimster.de/produkt/michas-muesli-unsere-3-korn-proteinquelle/?gclid=Cj0KCQiAzfuNBhCGARIsAD1nu--DnmfJtANXwDeW4VFEeJsi9lS5oH2kETzNlK38x5nKDi9jP9wOIoYaAojnEALw_wcB"));

    }

}
