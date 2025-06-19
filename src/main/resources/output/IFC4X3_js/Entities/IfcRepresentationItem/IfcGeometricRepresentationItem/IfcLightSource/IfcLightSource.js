class IfcLightSource extends IfcGeometricRepresentationItem {
    constructor() {
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCCOLOURRGB} */
        this.LightColour = null;
        /** @type {IFCNORMALISEDRATIOMEASURE} */
        this.AmbientIntensity = null;
        /** @type {IFCNORMALISEDRATIOMEASURE} */
        this.Intensity = null;
    }

    // === EXTENDED BY ===
    // IfcLightSourceAmbient
    // IfcLightSourceDirectional
    // IfcLightSourceGoniometric
    // IfcLightSourcePositional
}
