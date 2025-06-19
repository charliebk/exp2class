Public Class IfcCShapeProfileDef Inherits IfcParameterizedProfileDef
    Public Depth As IfcPositiveLengthMeasure
    Public Width As IfcPositiveLengthMeasure
    Public WallThickness As IfcPositiveLengthMeasure
    Public Girth As IfcPositiveLengthMeasure
    Public InternalFilletRadius As IfcNonNegativeLengthMeasure

    ' === WHERE CLAUSES ===
    ' ValidGirth : Girth < (Depth / 2.)
    ' ValidInternalFilletRadius : NOT(EXISTS(InternalFilletRadius)) OR ((InternalFilletRadius <= Width/2. - WallThickness) AND (InternalFilletRadius <= Depth/2. - WallThickness))
    ' ValidWallThickness : (WallThickness < Width/2.) AND (WallThickness < Depth/2.)
End Class
