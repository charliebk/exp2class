public class IfcFillAreaStyle extends IfcPresentationStyle {
    public SET [1:?] OF IfcFillStyleSelect FillStyles;
    public IfcBoolean ModelOrDraughting;

    // === WHERE CLAUSES ===
    // ConsistentHatchStyleDef : IfcCorrectFillAreaStyle(SELF.FillStyles)
    // MaxOneColour : SIZEOF(QUERY(Style <* SELF.FillStyles | 'IFC4X3_DEV_73740fe4.IFCCOLOUR' IN TYPEOF(Style) )) <= 1
    // MaxOneExtHatchStyle : SIZEOF(QUERY(Style <* SELF.FillStyles | 'IFC4X3_DEV_73740fe4.IFCEXTERNALLYDEFINEDHATCHSTYLE' IN TYPEOF(Style) )) <= 1
}
