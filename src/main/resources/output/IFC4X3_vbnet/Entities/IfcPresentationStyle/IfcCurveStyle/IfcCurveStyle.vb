Public Class IfcCurveStyle Inherits IfcPresentationStyle
    Public CurveFont As IfcCurveFontOrScaledCurveFontSelect
    Public CurveWidth As IfcSizeSelect
    Public CurveColour As IfcColour
    Public ModelOrDraughting As IfcBoolean

    ' === WHERE CLAUSES ===
    ' IdentifiableCurveStyle : EXISTS(CurveFont) OR EXISTS(CurveWidth) OR EXISTS(CurveColour)
    ' MeasureOfWidth : (NOT(EXISTS(CurveWidth))) OR ('IFC4X3_DEV_73740fe4.IFCPOSITIVELENGTHMEASURE' IN TYPEOF(CurveWidth)) OR (('IFC4X3_DEV_73740fe4.IFCDESCRIPTIVEMEASURE' IN TYPEOF(CurveWidth)) AND (CurveWidth = 'by layer'))
End Class
