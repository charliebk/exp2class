class IfcSurfaceStyleRendering extends IfcSurfaceStyleShading {
    constructor() {
        /** @type {IFCCOLOURORFACTOR} */
        this.DiffuseColour = null;
        /** @type {IFCCOLOURORFACTOR} */
        this.TransmissionColour = null;
        /** @type {IFCCOLOURORFACTOR} */
        this.DiffuseTransmissionColour = null;
        /** @type {IFCCOLOURORFACTOR} */
        this.ReflectionColour = null;
        /** @type {IFCCOLOURORFACTOR} */
        this.SpecularColour = null;
        /** @type {IFCSPECULARHIGHLIGHTSELECT} */
        this.SpecularHighlight = null;
        /** @type {IFCREFLECTANCEMETHODENUM} */
        this.ReflectanceMethod = null;
    }
}
