class IfcRigidOperation(IfcCoordinateOperation):
    def __init__(self):
        self.FirstCoordinate: IfcMeasureValue = None
        self.SecondCoordinate: IfcMeasureValue = None
        self.Height: IfcLengthMeasure = None

    # === WHERE CLAUSES ===
    # SameCoordinateType : (('IFC4X3_DEV_73740fe4.IFCLENGTHMEASURE' IN TYPEOF(FirstCoordinate)) AND ('IFC4X3_DEV_73740fe4.IFCLENGTHMEASURE' IN TYPEOF(SecondCoordinate))) OR (('IFC4X3_DEV_73740fe4.IFCPLANEANGLEMEASURE' IN TYPEOF(FirstCoordinate)) AND ('IFC4X3_DEV_73740fe4.IFCPLANEANGLEMEASURE' IN TYPEOF(SecondCoordinate)))
