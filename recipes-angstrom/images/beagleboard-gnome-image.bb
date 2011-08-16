require beagleboard-image.bb

IMAGE_INSTALL += " \
	angstrom-task-gnome \
	task-xserver \
	vim \
	alsa-tools \
	alsa-utils \
"

# Provided by angstrom-task-gnome:
#	task-gnome \
#	task-gnome-apps \
#	task-gnome-themes \
#	task-gnome-xserver-base \
#	task-gnome-fonts \

export IMAGE_BASENAME = "beagleboard-gnome-image"

