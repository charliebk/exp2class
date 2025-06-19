Public Class IfcTextStyleFontModel Inherits IfcPreDefinedTextFont
    Public FontFamily As List(Of IfcTextFontName)
    Public FontStyle As IfcFontStyle
    Public FontVariant As IfcFontVariant
    Public FontWeight As IfcFontWeight
    Public FontSize As IfcSizeSelect

    ' === WHERE CLAUSES ===
    ' MeasureOfFontSize : ('IFC4X3_DEV_73740fe4.IFCLENGTHMEASURE' IN TYPEOF(SELF.FontSize)) AND (SELF.FontSize > 0.)
End Class
