class IfcStructuralActivity(IfcProduct):
    def __init__(self):
        self.AppliedLoad: IfcStructuralLoad = None
        self.GlobalOrLocal: IfcGlobalOrLocalEnum = None

    # === EXTENDED BY ===
    # IfcStructuralAction
    # IfcStructuralReaction

    # === INVERSE CLAUSES ===
    # AssignedToStructuralItem : SET [0:1] OF IfcRelConnectsStructuralActivity FOR RelatedStructuralActivity
