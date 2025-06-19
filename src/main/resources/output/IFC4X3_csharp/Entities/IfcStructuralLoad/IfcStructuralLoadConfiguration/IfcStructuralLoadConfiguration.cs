public class IfcStructuralLoadConfiguration : IfcStructuralLoad
{
    public List<IfcStructuralLoadOrResult> Values { get; set; }
    public List<UNIQUE LIST [1:2] OF IfcLengthMeasure> Locations { get; set; }

    // === WHERE CLAUSES ===
    // ValidListSize : NOT EXISTS(Locations) OR (SIZEOF(Locations) = SIZEOF(Values))
}
