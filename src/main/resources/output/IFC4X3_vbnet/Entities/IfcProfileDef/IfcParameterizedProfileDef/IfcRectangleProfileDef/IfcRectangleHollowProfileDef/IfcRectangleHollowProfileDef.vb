Public Class IfcRectangleHollowProfileDef Inherits IfcRectangleProfileDef
    Public WallThickness As IfcPositiveLengthMeasure
    Public InnerFilletRadius As IfcNonNegativeLengthMeasure
    Public OuterFilletRadius As IfcNonNegativeLengthMeasure

    ' === WHERE CLAUSES ===
    ' ValidInnerRadius : NOT(EXISTS(InnerFilletRadius)) OR ((InnerFilletRadius <= (SELF\IfcRectangleProfileDef.XDim/2. - WallThickness)) AND (InnerFilletRadius <= (SELF\IfcRectangleProfileDef.YDim/2. - WallThickness)))
    ' ValidOuterRadius : NOT(EXISTS(OuterFilletRadius)) OR ((OuterFilletRadius <= (SELF\IfcRectangleProfileDef.XDim/2.)) AND (OuterFilletRadius <= (SELF\IfcRectangleProfileDef.YDim/2.)))
    ' ValidWallThickness : (WallThickness < (SELF\IfcRectangleProfileDef.XDim/2.)) AND (WallThickness < (SELF\IfcRectangleProfileDef.YDim/2.))
End Class
