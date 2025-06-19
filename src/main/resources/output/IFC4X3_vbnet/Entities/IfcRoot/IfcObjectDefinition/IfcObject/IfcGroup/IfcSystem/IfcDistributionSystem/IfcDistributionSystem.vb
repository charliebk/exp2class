Public Class IfcDistributionSystem Inherits IfcSystem
    Public LongName As IfcLabel
    Public PredefinedType As IfcDistributionSystemEnum

    ' === EXTENDED BY ===
    ' IfcDistributionCircuit

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcDistributionSystemEnum.USERDEFINED) OR ((PredefinedType = IfcDistributionSystemEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
