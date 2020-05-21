#!/bin/bash
mv /etc/ansible/hosts /etc/ansible/hosts.back
touch /etc/ansible/hosts
echo "[localhost]" > /etc/ansible/hosts
#Extra line added in the script to run all command line arguments
exec "$@";