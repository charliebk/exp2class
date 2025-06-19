class IfcLightSourceSpot extends IfcLightSourcePositional {
    constructor() {
        /** @type {IFCDIRECTION} */
        this.Orientation = null;
        /** @type {IFCREAL} */
        this.ConcentrationExponent = null;
        /** @type {IFCPOSITIVEPLANEANGLEMEASURE} */
        this.SpreadAngle = null;
        /** @type {IFCPOSITIVEPLANEANGLEMEASURE} */
        this.BeamWidthAngle = null;
    }
}
