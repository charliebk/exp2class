class IfcLightSourceGoniometric extends IfcLightSource {
    constructor() {
        /** @type {IFCAXIS2PLACEMENT3D} */
        this.Position = null;
        /** @type {IFCCOLOURRGB} */
        this.ColourAppearance = null;
        /** @type {IFCTHERMODYNAMICTEMPERATUREMEASURE} */
        this.ColourTemperature = null;
        /** @type {IFCLUMINOUSFLUXMEASURE} */
        this.LuminousFlux = null;
        /** @type {IFCLIGHTEMISSIONSOURCEENUM} */
        this.LightEmissionSource = null;
        /** @type {IFCLIGHTDISTRIBUTIONDATASOURCESELECT} */
        this.LightDistributionDataSource = null;
    }
}
