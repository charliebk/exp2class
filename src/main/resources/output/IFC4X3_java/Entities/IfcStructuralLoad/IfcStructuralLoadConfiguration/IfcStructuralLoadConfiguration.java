public class IfcStructuralLoadConfiguration extends IfcStructuralLoad {
    public List<IfcStructuralLoadOrResult> Values;
    public List<UNIQUE LIST [1:2] OF IfcLengthMeasure> Locations;

    // === WHERE CLAUSES ===
    // ValidListSize : NOT EXISTS(Locations) OR (SIZEOF(Locations) = SIZEOF(Values))
}
