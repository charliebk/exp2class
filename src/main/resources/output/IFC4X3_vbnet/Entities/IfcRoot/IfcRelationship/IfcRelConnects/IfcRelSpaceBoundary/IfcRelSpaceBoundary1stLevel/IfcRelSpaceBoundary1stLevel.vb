Public Class IfcRelSpaceBoundary1stLevel Inherits IfcRelSpaceBoundary
    Public ParentBoundary As IfcRelSpaceBoundary1stLevel

    ' === EXTENDED BY ===
    ' IfcRelSpaceBoundary2ndLevel

    ' === INVERSE CLAUSES ===
    ' InnerBoundaries : SET [0:?] OF IfcRelSpaceBoundary1stLevel FOR ParentBoundary
End Class
