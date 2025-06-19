public class IfcTrimmedCurve : IfcBoundedCurve
{
    public IfcCurve BasisCurve { get; set; }
    public SET [1:2] OF IfcTrimmingSelect Trim1 { get; set; }
    public SET [1:2] OF IfcTrimmingSelect Trim2 { get; set; }
    public IfcBoolean SenseAgreement { get; set; }
    public IfcTrimmingPreference MasterRepresentation { get; set; }

    // === WHERE CLAUSES ===
    // NoTrimOfBoundedCurves : NOT('IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE' IN TYPEOF(BasisCurve))
    // Trim1ValuesConsistent : (HIINDEX(Trim1) = 1) OR (TYPEOF(Trim1[1]) <> TYPEOF(Trim1[2]))
    // Trim2ValuesConsistent : (HIINDEX(Trim2) = 1) OR (TYPEOF(Trim2[1]) <> TYPEOF(Trim2[2]))
}
