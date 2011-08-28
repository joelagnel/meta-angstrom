#Angstrom image to test systemd

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

IMAGE_PREPROCESS_COMMAND = "rootfs_update_timestamp"


IMAGE_INSTALL += " \
	angstrom-task-boot \
	angstrom-zeroconf-audio \
	rsyslog \
	dropbear-systemd openssh-sftp \
	e2fsprogs-e2fsck e2fsprogs-blkid \
	avahi-daemon avahi-utils avahi-systemd \
	${CONMANPKGS} \
	systemd-compat-units \
	cpufrequtils \
	beagleboard-test-scripts \
	gstreamer-ti \
	ti-dmai-apps \
    htop \
"

CONMANPKGS = "connman connman-plugin-loopback connman-plugin-ethernet connman-plugin-wifi connman-systemd"
CONMANPKGS_libc-uclibc = ""

IMAGE_DEV_MANAGER   = "udev"
IMAGE_INITSCRIPTS   = " "
IMAGE_INIT_MANAGER  = "systemd"
IMAGE_LOGIN_MANAGER = "tinylogin shadow"

export IMAGE_BASENAME = "beagleboard-image"

inherit image
