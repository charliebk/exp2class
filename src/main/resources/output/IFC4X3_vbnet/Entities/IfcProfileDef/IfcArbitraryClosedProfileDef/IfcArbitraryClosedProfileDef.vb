Public Class IfcArbitraryClosedProfileDef Inherits IfcProfileDef
    Public OuterCurve As IfcCurve

    ' === EXTENDED BY ===
    ' IfcArbitraryProfileDefWithVoids

    ' === WHERE CLAUSES ===
    ' WR1 : OuterCurve.Dim = 2
    ' WR2 : NOT('IFC4X3_DEV_73740fe4.IFCLINE' IN TYPEOF(OuterCurve))
    ' WR3 : NOT('IFC4X3_DEV_73740fe4.IFCOFFSETCURVE2D' IN TYPEOF(OuterCurve))
End Class
