public class IfcTextStyleFontModel : IfcPreDefinedTextFont
{
    public List<IfcTextFontName> FontFamily { get; set; }
    public IfcFontStyle FontStyle { get; set; }
    public IfcFontVariant FontVariant { get; set; }
    public IfcFontWeight FontWeight { get; set; }
    public IfcSizeSelect FontSize { get; set; }

    // === WHERE CLAUSES ===
    // MeasureOfFontSize : ('IFC4X3_DEV_73740fe4.IFCLENGTHMEASURE' IN TYPEOF(SELF.FontSize)) AND (SELF.FontSize > 0.)
}
