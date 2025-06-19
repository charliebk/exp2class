Public Class IfcOccupant Inherits IfcActor
    Public PredefinedType As IfcOccupantTypeEnum

    ' === WHERE CLAUSES ===
    ' WR31 : NOT(PredefinedType = IfcOccupantTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
End Class
