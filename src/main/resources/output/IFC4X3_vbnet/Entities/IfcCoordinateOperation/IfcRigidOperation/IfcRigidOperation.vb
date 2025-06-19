Public Class IfcRigidOperation Inherits IfcCoordinateOperation
    Public FirstCoordinate As IfcMeasureValue
    Public SecondCoordinate As IfcMeasureValue
    Public Height As IfcLengthMeasure

    ' === WHERE CLAUSES ===
    ' SameCoordinateType : (('IFC4X3_DEV_73740fe4.IFCLENGTHMEASURE' IN TYPEOF(FirstCoordinate)) AND ('IFC4X3_DEV_73740fe4.IFCLENGTHMEASURE' IN TYPEOF(SecondCoordinate))) OR (('IFC4X3_DEV_73740fe4.IFCPLANEANGLEMEASURE' IN TYPEOF(FirstCoordinate)) AND ('IFC4X3_DEV_73740fe4.IFCPLANEANGLEMEASURE' IN TYPEOF(SecondCoordinate)))
End Class
