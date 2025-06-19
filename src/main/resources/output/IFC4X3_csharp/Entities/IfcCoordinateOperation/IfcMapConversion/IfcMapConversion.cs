public class IfcMapConversion : IfcCoordinateOperation
{
    public IfcLengthMeasure Eastings { get; set; }
    public IfcLengthMeasure Northings { get; set; }
    public IfcLengthMeasure OrthogonalHeight { get; set; }
    public IfcReal XAxisAbscissa { get; set; }
    public IfcReal XAxisOrdinate { get; set; }
    public IfcReal Scale { get; set; }

    // === EXTENDED BY ===
    // IfcMapConversionScaled

    // === WHERE CLAUSES ===
    // TargetCRSOnlyProjected : 'IFC4X3_DEV_73740fe4.IFCPROJECTEDCRS' IN TYPEOF(SELF\IfcCoordinateOperation.TargetCRS)
}
