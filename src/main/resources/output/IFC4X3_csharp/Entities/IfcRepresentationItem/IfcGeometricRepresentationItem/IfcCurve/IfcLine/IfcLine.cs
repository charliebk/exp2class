public class IfcLine : IfcCurve
{
    public IfcCartesianPoint Pnt { get; set; }
    public IfcVector Dir { get; set; }

    // === WHERE CLAUSES ===
    // SameDim : Dir.Dim = Pnt.Dim
}
