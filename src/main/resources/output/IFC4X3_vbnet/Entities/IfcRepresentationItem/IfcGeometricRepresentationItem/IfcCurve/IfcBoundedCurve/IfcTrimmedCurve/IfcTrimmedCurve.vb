Public Class IfcTrimmedCurve Inherits IfcBoundedCurve
    Public BasisCurve As IfcCurve
    Public Trim1 As SET [1:2] OF IfcTrimmingSelect
    Public Trim2 As SET [1:2] OF IfcTrimmingSelect
    Public SenseAgreement As IfcBoolean
    Public MasterRepresentation As IfcTrimmingPreference

    ' === WHERE CLAUSES ===
    ' NoTrimOfBoundedCurves : NOT('IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE' IN TYPEOF(BasisCurve))
    ' Trim1ValuesConsistent : (HIINDEX(Trim1) = 1) OR (TYPEOF(Trim1[1]) <> TYPEOF(Trim1[2]))
    ' Trim2ValuesConsistent : (HIINDEX(Trim2) = 1) OR (TYPEOF(Trim2[1]) <> TYPEOF(Trim2[2]))
End Class
