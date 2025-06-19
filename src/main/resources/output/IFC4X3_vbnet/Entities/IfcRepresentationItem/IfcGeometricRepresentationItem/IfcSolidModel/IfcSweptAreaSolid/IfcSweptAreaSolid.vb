Public Class IfcSweptAreaSolid Inherits IfcSolidModel
    Public SweptArea As IfcProfileDef
    Public Position As IfcAxis2Placement3D

    ' === EXTENDED BY ===
    ' IfcDirectrixCurveSweptAreaSolid
    ' IfcExtrudedAreaSolid
    ' IfcRevolvedAreaSolid

    ' === WHERE CLAUSES ===
    ' SweptAreaType : SweptArea.ProfileType = IfcProfileTypeEnum.Area
End Class
