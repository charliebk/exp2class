class IfcReinforcementBarProperties extends IfcPreDefinedProperties {
    constructor() {
        /** @type {IFCAREAMEASURE} */
        this.TotalCrossSectionArea = null;
        /** @type {IFCLABEL} */
        this.SteelGrade = null;
        /** @type {IFCREINFORCINGBARSURFACEENUM} */
        this.BarSurface = null;
        /** @type {IFCLENGTHMEASURE} */
        this.EffectiveDepth = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.NominalBarDiameter = null;
        /** @type {IFCCOUNTMEASURE} */
        this.BarCount = null;
    }
}
