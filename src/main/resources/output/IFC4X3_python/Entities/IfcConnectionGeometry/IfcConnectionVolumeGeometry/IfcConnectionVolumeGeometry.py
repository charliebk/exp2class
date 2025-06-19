class IfcConnectionVolumeGeometry(IfcConnectionGeometry):
    def __init__(self):
        self.VolumeOnRelatingElement: IfcSolidOrShell = None
        self.VolumeOnRelatedElement: IfcSolidOrShell = None
