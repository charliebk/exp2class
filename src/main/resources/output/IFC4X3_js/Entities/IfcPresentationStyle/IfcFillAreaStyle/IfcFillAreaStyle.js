class IfcFillAreaStyle extends IfcPresentationStyle {
    constructor() {
        /** @type {SET [1:?] OF IFCFILLSTYLESELECT} */
        this.FillStyles = null;
        /** @type {IFCBOOLEAN} */
        this.ModelOrDraughting = null;
    }

    // === WHERE CLAUSES ===
    // ConsistentHatchStyleDef : IfcCorrectFillAreaStyle(SELF.FillStyles)
    // MaxOneColour : SIZEOF(QUERY(Style <* SELF.FillStyles | 'IFC4X3_DEV_73740fe4.IFCCOLOUR' IN TYPEOF(Style) )) <= 1
    // MaxOneExtHatchStyle : SIZEOF(QUERY(Style <* SELF.FillStyles | 'IFC4X3_DEV_73740fe4.IFCEXTERNALLYDEFINEDHATCHSTYLE' IN TYPEOF(Style) )) <= 1
}
