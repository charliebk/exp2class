Public Class IfcLine Inherits IfcCurve
    Public Pnt As IfcCartesianPoint
    Public Dir As IfcVector

    ' === WHERE CLAUSES ===
    ' SameDim : Dir.Dim = Pnt.Dim
End Class
