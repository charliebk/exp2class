public class IfcRelContainedInSpatialStructure : IfcRelConnects
{
    public SET [1:?] OF IfcProduct RelatedElements { get; set; }
    public IfcSpatialElement RelatingStructure { get; set; }

    // === WHERE CLAUSES ===
    // WR31 : SIZEOF(QUERY(temp <* RelatedElements | 'IFC4X3_DEV_73740fe4.IFCSPATIALSTRUCTUREELEMENT' IN TYPEOF(temp))) = 0
}
