class IfcAlignmentCantSegment extends IfcAlignmentParameterSegment {
    constructor() {
        /** @type {IFCLENGTHMEASURE} */
        this.StartDistAlong = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.HorizontalLength = null;
        /** @type {IFCLENGTHMEASURE} */
        this.StartCantLeft = null;
        /** @type {IFCLENGTHMEASURE} */
        this.EndCantLeft = null;
        /** @type {IFCLENGTHMEASURE} */
        this.StartCantRight = null;
        /** @type {IFCLENGTHMEASURE} */
        this.EndCantRight = null;
        /** @type {IFCALIGNMENTCANTSEGMENTTYPEENUM} */
        this.PredefinedType = null;
    }
}
