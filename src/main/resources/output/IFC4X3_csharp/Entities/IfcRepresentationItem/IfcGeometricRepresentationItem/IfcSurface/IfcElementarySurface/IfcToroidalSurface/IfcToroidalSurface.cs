public class IfcToroidalSurface : IfcElementarySurface
{
    public IfcPositiveLengthMeasure MajorRadius { get; set; }
    public IfcPositiveLengthMeasure MinorRadius { get; set; }

    // === WHERE CLAUSES ===
    // MajorLargerMinor : MinorRadius < MajorRadius
}
