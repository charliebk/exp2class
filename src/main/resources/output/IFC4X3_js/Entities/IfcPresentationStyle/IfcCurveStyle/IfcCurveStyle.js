class IfcCurveStyle extends IfcPresentationStyle {
    constructor() {
        /** @type {IFCCURVEFONTORSCALEDCURVEFONTSELECT} */
        this.CurveFont = null;
        /** @type {IFCSIZESELECT} */
        this.CurveWidth = null;
        /** @type {IFCCOLOUR} */
        this.CurveColour = null;
        /** @type {IFCBOOLEAN} */
        this.ModelOrDraughting = null;
    }

    // === WHERE CLAUSES ===
    // IdentifiableCurveStyle : EXISTS(CurveFont) OR EXISTS(CurveWidth) OR EXISTS(CurveColour)
    // MeasureOfWidth : (NOT(EXISTS(CurveWidth))) OR ('IFC4X3_DEV_73740fe4.IFCPOSITIVELENGTHMEASURE' IN TYPEOF(CurveWidth)) OR (('IFC4X3_DEV_73740fe4.IFCDESCRIPTIVEMEASURE' IN TYPEOF(CurveWidth)) AND (CurveWidth = 'by layer'))
}
