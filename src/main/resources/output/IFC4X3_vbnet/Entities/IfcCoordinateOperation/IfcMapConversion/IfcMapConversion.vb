Public Class IfcMapConversion Inherits IfcCoordinateOperation
    Public Eastings As IfcLengthMeasure
    Public Northings As IfcLengthMeasure
    Public OrthogonalHeight As IfcLengthMeasure
    Public XAxisAbscissa As IfcReal
    Public XAxisOrdinate As IfcReal
    Public Scale As IfcReal

    ' === EXTENDED BY ===
    ' IfcMapConversionScaled

    ' === WHERE CLAUSES ===
    ' TargetCRSOnlyProjected : 'IFC4X3_DEV_73740fe4.IFCPROJECTEDCRS' IN TYPEOF(SELF\IfcCoordinateOperation.TargetCRS)
End Class
