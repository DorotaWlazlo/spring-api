package com.example.stationerystoreapi;

import com.example.stationerystoreapi.model.Product;
import com.example.stationerystoreapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    private final ProductRepository productRepository;

    @Autowired
    public DatabaseInitializer(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) {
        initializeProducts();
    }

    private void initializeProducts() {
        //Pens
        Product product1 = new Product("Uni-ball Signo Broad Gel Rollerball Pen UM-153 Metallic", "pen","Uni-ball", 3.99, "The Uni-ball Signo Broad rollerball features a 1.0mm point that delivers a broad 0.6mm line of waterproof and fadeproof metallic gel ink. Rubber grip area.");
        productRepository.save(product1);
        Product product2 = new Product("Pentel EnerGel X Gel Rollerball Pen BL107", "pen", "Pentel", 2.99, "Pentel EnerGel X is the latest member of the EnerGel family. EnerGel X is a quick-drying, smooth-writing gel ink retractable pen with an easy-hold rubber grip and see-through barrel giving a visible ink supply on the easy-change refill.");
        productRepository.save(product2);
        Product product3 = new Product("Pilot G-Tec-C4 Rollerball Pen BLGC4", "pen","Pilot", 2.49, "A Cult Pens best-seller, the G-Tec-C4 is an ultra-fine rollerball pen ideal for any application where fine, precise writing is required. The 0.4mm rollerball writes a 0.2mm line of pure vivid gel colour without spreading.");
        productRepository.save(product3);
        Product product4 = new Product("Uni-ball Signo 207 RT Gel Rollerball Pen UMN-207", "pen","Uni-ball", 2.89, "Premium quality retractable gel ink rollerball featuring highly-secure waterproof pigment gel ink. Smooth-writing; comfortable rubber grip; and high-quality finish with chrome accents. 0.7mm nib writes a 0.4mm line.");
        productRepository.save(product4);
        Product product5 = new Product("Pilot G2 07 Gel Ink Rollerball Pen BLG207", "pen","Pilot", 1.99, "The Pilot G2 07 is a smooth-writing retractable gel rollerball with a comfortable cushion grip and archival acid-free ink - a renowned best-seller all over the world. 0.7mm ball writes a 0.39mm line.");
        productRepository.save(product5);
        Product product6 = new Product("Pentel EnerGel Xm Retractable Rollerball Pen BL77", "pen","Pentel", 2.49, "The Pentel EnerGel Xm Retractable rollerball is the latest EnerGel pen, boasting a stylish metal-look barrel. There's a rubber grip area with grooved fingerprint pattern, and a metal pocket clip.");
        productRepository.save(product6);
        Product product7 = new Product("Zebra Sarasa Gel Rollerball Pen Medium 0.7mm", "pen","Zebra", 2.99, "The Zebra Sarasa is a classic retractable gel ink rollerball with smooth writing ink.\n" + "Dries in seconds making it particularly suitable for left-handed writers.");
        productRepository.save(product7);
        Product product8 = new Product("BIC Cristal Celebrate Gold Ballpoint Pen", "pen","BIC", 1.09, "The BIC Cristal - probably the best-known ballpoint in the world. It's inexpensive, it's reliable, it writes really smoothly and it's safe to say there can't be many households without at least one Cristal stuffed into a kitchen drawer.");
        productRepository.save(product8);
        Product product9 = new Product("BIC Cristal Fine Ballpoint Pen", "pen","BIC", 0.29, "Just when you thought the world's best-known ballpoint couldn't get any better, it does. This is the fine-tipped version of the classic BIC Cristal, which writes a 0.8mm width line.");
        productRepository.save(product9);
        Product product10 = new Product("BIC Cristal Fun Ballpoint Pen", "pen","BIC", 0.39, "The classic BIC Cristal, but in funkier ink colours: lime green, orange, pink, purple and turquoise. Inexpensive, reliable, smooth-writing.");
        productRepository.save(product10);

        //Highlighters
        Product highlighter1 = new Product("STABILO Swing Cool Pastel Edition Highlighter", "highlighter","STABILO", 1.99, "STABILO Swing Cool pastel highlighter. Slender-profiled highlighter with a useful pocket clip.");
        productRepository.save(highlighter1);
        Product highlighter2 = new Product("Pilot Frixion Light Erasable Highlighter", "highlighter","Pilot", 2.19, "The world's first erasable ink highlighter. The Pilot Frixion Light SW-FL highlighter builds on the the success of the Frixion rollerball and the unique ink that cleanly erases with the friction of the eraser on the end of the pen.");
        productRepository.save(highlighter2);
        Product highlighter3 = new Product("BIC Brite Liner Grip Highlighter", "highlighter","BIC", 0.69, "BIC Briteliner Grip Highlighter. Nice slender barrel with a comfortable ergonomic grip, perfect for a pencil case.");
        productRepository.save(highlighter3);
        Product highlighter4 = new Product("Zebra Mildliner Twin Tip Pastel Highlighter", "highlighter","Zebra", 9.99, "Zebra's Mildliner is not just somewhat gentler on the eye than your usual highlighter, it's got twin tips too! The colours are pastel but still make words or passages stand out, just as with normal highlighters.");
        productRepository.save(highlighter4);
        Product highlighter5 = new Product("Faber-Castell Textliner 46 Metallic", "highlighter","Faber-Castell", 1.29, "Faber-Castell Textliner 46 in stunning metallic colours! Add a touch of sparkle to your highlighted text.");
        productRepository.save(highlighter5);

        //Fountain pens
        Product fountain1 = new Product("Pilot VPen (V4) Disposable Fountain Pen", "fountain pen","Pilot", 6.99, "The classic and popular Pilot V4, or Vpen, is a disposable fountain pen with a quality steel nib in 0.58mm medium point.");
        productRepository.save(fountain1);
        Product fountain2 = new Product("Zebra Disposable Fountain Pen", "fountain pen","Zebra", 23.99, "Disposable fountain pens have a wide appeal - they have the sophistication of a 'proper' writing instrument, but with the convenience of a ballpoint. ");
        productRepository.save(fountain2);
        Product fountain3 = new Product("Faber-Castell Fresh Fountain Pen Light Green", "fountain pen","Faber-Castell", 8.99, "With its simple barrel design in a choice of bright colours and a rubberised grip area, the Fresh is a comfortable way to start writing with a fountain pen.");
        productRepository.save(fountain3);
        Product fountain4 = new Product("Kaweco Liliput Fountain Pen Brass", "fountain pen","Kaweco", 89.99, "Brass is a wonderful material for producing pens. It's strong, it's heavy and it looks and feels great. Lots of pens have brass barrels or components but the brass is normally hidden away under layers of paint or plastic.");
        productRepository.save(fountain4);
        Product fountain5 = new Product("Kaweco Skyline Classic Sport Fountain Pen Black", "fountain pen","Kaweco", 30.99, "The Classic Sport closely follows an original 1935 octagonal design - 'Small in the pocket, large in the hand'. The oversized cap arrangement creates a small closed pen but a full length open pen.");
        productRepository.save(fountain5);
        Product fountain6 = new Product("Pentel Sterling Fountain Pen Garnet with Gift Box", "fountain pen","Pentel", 42.99, "Pentel Sterling fountain pen with light blue lacquer body and gold trim. Medium nib. Includes black Pentel ink cartridge.");
        productRepository.save(fountain6);

        //Markers
        Product marker1 = new Product("Pilot Paint Marker Pen SCPM", "marker","Pilot", 7.99, "The industrial-grade Pilot Paint Marker is permanent and waterproof on most non-absorbent surfaces. Medium bullet tip creates a 2mm line. Sharp glossy finish in vivid oil-based paint colours.");
        productRepository.save(marker1);
        Product marker2 = new Product("Pentel White Marker Pen Fine 100WS", "marker","Pentel", 9.99, "Pentel White Marker 100W S. Valve-controlled marker for non-absorbent surfaces, eg. rubber, glass, etc. White china clay pigment ink. The top white marker on the market.");
        productRepository.save(marker2);
        Product marker3 = new Product("Zebra Paint Marker Pen", "marker","Zebra", 3.89, "Zebra's 200MZ Paint Marker has opaque, waterproof, oil-based paint which will permanently and vividly mark just about any surface. Bullet-point nib writes approx. 1.5mm line.");
        productRepository.save(marker3);
        Product marker4 = new Product("edding 8750 Industry Paint Marker Bullet", "marker","edding", 9.79, "The edding 8750 industry paint marker is ideal for use on slightly oily, dusty and dark surfaces. Waterproof, low odour, with an opaque lacquer finish, and is extremely light-fast.");
        productRepository.save(marker4);
        Product marker5 = new Product("edding 751 Paint Marker Pen Pastel", "marker","edding", 8.49, "edding Paint Marker in a range of pastel colours, with a replaceable bullet tip. Highly-permanent low-odour pigment ink provides an opaque lacquer finish. Writes a 1-2mm line.");
        productRepository.save(marker5);

        //Pencils
        Product pencil1 = new Product("Faber-Castell 9000 Pencil", "pencil","Faber-Castell", 2.15, "The classic green Castell 9000 pencil has been at the top since 1905. Guaranteed easy-sharpening; water-based paint. available in 16 lead grades ideal for all purposes include writing, drawing, sketching and drafting.");
        productRepository.save(pencil1);
        Product pencil2 = new Product("Staedter Noris Pencil", "pencil","Staedter Noris", 1.14, "Staedtler Noris 120 Pencil is an economical yet high-quality pencil ideal for school and office use, in classic yellow-and-black striped livery.");
        productRepository.save(pencil2);
        Product pencil3 = new Product("STABILO GREENGraph eraser-tipped graphite pencil", "pencil","Stabilo", 0.79, "STABILO GREENGraph eraser-tipped graphite pencil. Made from FSC-certified Jelutong wood from sustainable forests.");
        productRepository.save(pencil3);
        Product pencil4 = new Product("Tombow Mono 100 Pencil", "pencil","Tombow", 3.57, "For many users the MONO 100 is the best pencil ever made. Soft touch when writing, unbreakable high-density graphite lead and a superb paint finish.");
        productRepository.save(pencil4);
        Product pencil5 = new Product("Derwent Drawing Pencil", "pencil","Derwent ", 2.43, "Soft, creamy pencils in earthy, neutral shades ideal for wildlife drawings, nature studies and portraiture. The wide colour strip is ideal for detailing feathers, fur and leaves.");
        productRepository.save(pencil5);

        //Mechanical pencils
        Product mechanicalpencil1 = new Product("Caran d'Ache Varius Ivanhoe Mechanical Pencil Black", "mechanical pencil","Caran d'Ache", 743.36, "Caran d'Ache Varius Ivanhoe Mechanical Pencil. A functional yet elegant writing instrument with contemporary styling, the Ivanhoe has a black chainmail effect barrel and rhodium-plated trim.");
        productRepository.save(mechanicalpencil1);
        Product mechanicalpencil2 = new Product("Faber-Castell Classic Pencil Sterling Silver", "mechanical pencil","Faber-Castell", 629.00, "This Classic collection pen is made from solid sterling silver (925/1000), with a highly-polished finish. Each pen is hallmarked and features a double-milled cap edge.");
        productRepository.save(mechanicalpencil2);
        Product mechanicalpencil3 = new Product("Uni Kuru Toga Advance Mechanical Pencil 0.5mm Gun Metal", "mechanical pencil","Uni", 23.59, "The unique gear mechanism of the Kuru Toga rotates the lead every time it is touched to the paper, resulting in a clean cone-shaped tip which is sharp and resistant to breaking.");
        productRepository.save(mechanicalpencil3);
        Product mechanicalpencil4 = new Product("Kaweco Brass Sport Mechanical Pencil", "mechanical pencil","Kaweco", 88.63, "Made from solid lead-free 'eco' brass, which is left untreated and uncoated, it weighs in at 36g which is more than most other mechanical pencils currently available.");
        productRepository.save(mechanicalpencil4);
        Product mechanicalpencil5 = new Product("OHTO Horizon Mechanical Pencil", "mechanical pencil","OHTO", 9.65, "OHTO Horizon Pencil is a completely pocket-safe pencil thanks to the 'double-knock' mechanism. Made with hexagonal aluminium barrel which becomes more cylindrical towards the tip.");
        productRepository.save(mechanicalpencil5);
    }
}
