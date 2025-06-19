public class IfcRigidOperation : IfcCoordinateOperation
{
    public IfcMeasureValue FirstCoordinate { get; set; }
    public IfcMeasureValue SecondCoordinate { get; set; }
    public IfcLengthMeasure Height { get; set; }

    // === WHERE CLAUSES ===
    // SameCoordinateType : (('IFC4X3_DEV_73740fe4.IFCLENGTHMEASURE' IN TYPEOF(FirstCoordinate)) AND ('IFC4X3_DEV_73740fe4.IFCLENGTHMEASURE' IN TYPEOF(SecondCoordinate))) OR (('IFC4X3_DEV_73740fe4.IFCPLANEANGLEMEASURE' IN TYPEOF(FirstCoordinate)) AND ('IFC4X3_DEV_73740fe4.IFCPLANEANGLEMEASURE' IN TYPEOF(SecondCoordinate)))
}
