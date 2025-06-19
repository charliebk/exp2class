class IfcStructuralItem(IfcProduct):
    def __init__(self):
        pass

    # === EXTENDED BY ===
    # IfcStructuralConnection
    # IfcStructuralMember

    # === INVERSE CLAUSES ===
    # AssignedStructuralActivity : SET [0:?] OF IfcRelConnectsStructuralActivity FOR RelatingElement
