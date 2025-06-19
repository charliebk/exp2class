class IfcAlignmentVerticalSegment extends IfcAlignmentParameterSegment {
    constructor() {
        /** @type {IFCLENGTHMEASURE} */
        this.StartDistAlong = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.HorizontalLength = null;
        /** @type {IFCLENGTHMEASURE} */
        this.StartHeight = null;
        /** @type {IFCRATIOMEASURE} */
        this.StartGradient = null;
        /** @type {IFCRATIOMEASURE} */
        this.EndGradient = null;
        /** @type {IFCLENGTHMEASURE} */
        this.RadiusOfCurvature = null;
        /** @type {IFCALIGNMENTVERTICALSEGMENTTYPEENUM} */
        this.PredefinedType = null;
    }
}
