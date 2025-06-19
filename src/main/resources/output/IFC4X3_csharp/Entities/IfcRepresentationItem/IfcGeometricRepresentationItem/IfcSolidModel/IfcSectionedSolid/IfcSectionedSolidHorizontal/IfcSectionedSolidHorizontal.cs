public class IfcSectionedSolidHorizontal : IfcSectionedSolid
{
    public List<IfcAxis2PlacementLinear> CrossSectionPositions { get; set; }

    // === WHERE CLAUSES ===
    // CorrespondingSectionPositions : SIZEOF(CrossSections) = SIZEOF(CrossSectionPositions)
    // NoLongitudinalOffsets : SIZEOF(QUERY(temp <* CrossSectionPositions | EXISTS(temp.Location.OffsetLongitudinal))) = 0
}
