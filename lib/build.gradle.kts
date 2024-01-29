plugins {
    `java-library`
    id("jaxb2-plugin") version "local"
}

dependencies {
    // default JAXB2 libs added by the plugin
    jaxb2("org.jvnet.jaxb2_commons:jaxb2-basics-ant:0.9.5")
    jaxb2("org.jvnet.jaxb2_commons:jaxb2-basics:0.9.5")
    jaxb2("org.jvnet.jaxb2_commons:jaxb2-basics-runtime:0.9.5")

    // default JAXB libs added by the plugin
    jaxb2("com.sun.xml.bind:jaxb-core:2.2.11")
    jaxb2("com.sun.xml.bind:jaxb-xjc:2.2.11")
    jaxb2("com.sun.xml.bind:jaxb-impl:2.2.11")
}

jaxb2 {
    xjc {
        create("generation-step") {
            basePackage = "com.example.shipment"
            schema = "src/main/xsd/shiporder.xsd"
        }
    }
}
