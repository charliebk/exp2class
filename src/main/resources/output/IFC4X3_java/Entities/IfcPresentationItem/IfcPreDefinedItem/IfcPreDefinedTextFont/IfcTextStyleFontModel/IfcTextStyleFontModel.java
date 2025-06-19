public class IfcTextStyleFontModel extends IfcPreDefinedTextFont {
    public List<IfcTextFontName> FontFamily;
    public IfcFontStyle FontStyle;
    public IfcFontVariant FontVariant;
    public IfcFontWeight FontWeight;
    public IfcSizeSelect FontSize;

    // === WHERE CLAUSES ===
    // MeasureOfFontSize : ('IFC4X3_DEV_73740fe4.IFCLENGTHMEASURE' IN TYPEOF(SELF.FontSize)) AND (SELF.FontSize > 0.)
}
