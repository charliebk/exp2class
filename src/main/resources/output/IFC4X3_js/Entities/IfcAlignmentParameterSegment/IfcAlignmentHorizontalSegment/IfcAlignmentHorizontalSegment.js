class IfcAlignmentHorizontalSegment extends IfcAlignmentParameterSegment {
    constructor() {
        /** @type {IFCCARTESIANPOINT} */
        this.StartPoint = null;
        /** @type {IFCPLANEANGLEMEASURE} */
        this.StartDirection = null;
        /** @type {IFCLENGTHMEASURE} */
        this.StartRadiusOfCurvature = null;
        /** @type {IFCLENGTHMEASURE} */
        this.EndRadiusOfCurvature = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.SegmentLength = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.GravityCenterLineHeight = null;
        /** @type {IFCALIGNMENTHORIZONTALSEGMENTTYPEENUM} */
        this.PredefinedType = null;
    }
}
